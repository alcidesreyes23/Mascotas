package com.example.mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ComidaAdapter extends RecyclerView.Adapter<ComidaAdapter.ViewHolder>  implements View.OnClickListener{

    private View.OnClickListener listener;

    @Override
    public void onClick(View v) {
        if (listener != null)
        {
            listener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView titulo, descripcion;
        private ImageView imgCat;

        public ViewHolder(View itemView){
            super(itemView);
            titulo = itemView.findViewById(R.id.txvTitulo);
            descripcion = itemView.findViewById(R.id.txvDesc);
            imgCat = itemView.findViewById(R.id.imgCat);
        }
    }
    public List<ComidaModelo> listaC;
    public ComidaAdapter(List<ComidaModelo> listaC) {
        this.listaC = listaC;
    }
    @NonNull
    @Override
    //Inflate: Método para hacer uso de un layout dentro de otro layout
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_mascotas,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setOnClickListener(this);
        return viewHolder;
    }
    @Override
    //Método que realiza las modificaciones del contenido para cada item
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(listaC.get(position).getTitulo());
        holder.descripcion.setText(listaC.get(position).getDescripcion());
        holder.imgCat.setImageResource(listaC.get(position).getCategoria());
    }

    @Override
    public int getItemCount() {
        return listaC.size();
    }

    public void setOnClickListener(AdapterView.OnClickListener listener)
    {
        this.listener = listener;
    }
}
