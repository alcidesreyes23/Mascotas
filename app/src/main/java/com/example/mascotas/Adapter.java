package com.example.mascotas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<Modelo> {
    private List<Modelo> mList;
    private Context mContext;
    private  int resourceLayout;


    public Adapter(@NonNull Context context, int resource, List<Modelo> objects) {
        super(context, resource, objects);
        this.mList=objects;
        this.mContext = context;
        this.resourceLayout=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null)
            view = LayoutInflater.from(mContext).inflate(R.layout.plantilla,null);

        Modelo modelo = mList.get(position);

        ImageView imagen = view.findViewById(R.id.imvDet);
        imagen.setImageResource(modelo.getIcon());

        TextView titulo = view.findViewById(R.id.txvDes);
        titulo.setText(modelo.getDetalles());

        TextView contenido = view.findViewById(R.id.txvPre);
        contenido.setText(modelo.getPrecio());

        return view;
    }
}
