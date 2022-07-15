package mx.org.totalapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import mx.org.totalapp.R;
import mx.org.totalapp.model.login.ArrayReference;

public class AdapterBancos extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ArrayReference> bancos;

    public AdapterBancos(Context context, int layout, List<ArrayReference> bancos){
        this.context = context;
        this.layout = layout;
        this.bancos = bancos;
    }

    @Override
    public int getCount() {
        return this.bancos.size();
    }

    @Override
    public Object getItem(int i) {
        return this.bancos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        v= layoutInflater.inflate(R.layout.adapter_bancos, null);
        // Valor actual según la posición

        ArrayReference currentName  = bancos.get(i);

        TextView textView = (TextView) v.findViewById(R.id.textView7);
        textView.setText(currentName.getBank());
        TextView textView2 = (TextView) v.findViewById(R.id.textView8);
        textView2.setText(currentName.getReference());
        ImageView image = (ImageView) v.findViewById(R.id.imageView3);


        if (currentName.getImages() != null)
        {
            Glide.with(context).load(currentName.getImages().get(0).getUrl3X3()).into(image);
        }

        //Devolvemos la vista inflada
        return v;
    }
}
