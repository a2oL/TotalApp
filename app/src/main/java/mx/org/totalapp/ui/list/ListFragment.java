package mx.org.totalapp.ui.list;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import mx.org.totalapp.R;
import mx.org.totalapp.adapter.AdapterBancos;
import mx.org.totalapp.databinding.FragmentListBinding;
import mx.org.totalapp.model.login.ArrayReference;
import mx.org.totalapp.model.login.Bancos;
import mx.org.totalapp.model.login.Login;

public class ListFragment extends Fragment {

    private FragmentListBinding binding;
    private ListViewModel listViewModel;
    private String token;
    Bancos bancos;

    public ListFragment(String s) {
        this.token = s;
    }

    public static ListFragment newInstance() {
        return new ListFragment("");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        listViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) new ViewModelProvider.NewInstanceFactory()).get(ListViewModel.class);
        binding = FragmentListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        listViewModel.getBancos(requireContext(),token).observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.e("DSDSDDSD", s);
                Gson myGson = new GsonBuilder().setPrettyPrinting().create();
                bancos = myGson.fromJson(s, Bancos.class);

                List<ArrayReference> bancosa = bancos.getArrayReferences();
                ListView listBancos = binding.listBancos;
                Log.e("BANSOS", bancosa.toString());

                AdapterBancos adaptador = new AdapterBancos(requireContext(),R.layout.adapter_bancos,bancosa);
                listBancos.setAdapter(adaptador);
            }
        });


        return root;
    }

}