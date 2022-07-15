package mx.org.totalapp.ui.login;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import mx.org.totalapp.R;
import mx.org.totalapp.databinding.FragmentLoginBinding;
import mx.org.totalapp.model.login.Login;
import mx.org.totalapp.ui.list.ListFragment;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;               // Binding de la app.
    private LoginViewModel loginViewModel;              // View Model de la app.

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        loginViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) new ViewModelProvider.NewInstanceFactory()).get(LoginViewModel.class);
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final Button btn_Ingresar = binding.button;

        btn_Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginViewModel.getToken(requireContext(),"A", "A").observe(getViewLifecycleOwner(), new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        Gson myGson = new GsonBuilder().setPrettyPrinting().create();
                        Login login = myGson.fromJson(s, Login.class);
                        ListFragment fr = new ListFragment(login.getSession());
                        getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.container,fr)
                                .addToBackStack(null)
                                .commit();
                    }
                });
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}