package com.example.mascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ComidaGatos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam2;

    public ComidaGatos() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ComidaGatos newInstance(String param1, String param2) {
        ComidaGatos fragment = new ComidaGatos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_comida_gatos,container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rcvProductos);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ComidaAdapter comidaAdapter = new ComidaAdapter(mostrarCategorias());
        recyclerView.setAdapter(comidaAdapter);

        return view;
    }

    public List<ComidaModelo> mostrarCategorias(){
        List<ComidaModelo> libros = new ArrayList<>();
        libros.add(new ComidaModelo( R.string.titulo1,R.string.descripcion1,R.drawable.gati));
        libros.add(new ComidaModelo( R.string.titulo2,R.string.descripcion2,R.drawable.gati2));
        libros.add(new ComidaModelo( R.string.titulo3,R.string.descripcion3,R.drawable.whiskas));
        libros.add(new ComidaModelo( R.string.titulo4,R.string.descripcion4,R.drawable.whiskas2));
        return libros;
    }
}