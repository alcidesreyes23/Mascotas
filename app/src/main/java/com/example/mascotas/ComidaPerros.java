package com.example.mascotas;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ComidaPerros#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComidaPerros extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView mlsvComida;
    private List<Modelo> mList = new ArrayList<>();
    ListAdapter mAdapter;

    private Button btnAdd,btnAdd1,btnAdd2,btnAdd3,btnAdd4;
    public ComidaPerros() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ComidaPerros.
     */
    // TODO: Rename and change types and number of parameters
    public static ComidaPerros newInstance(String param1, String param2) {
        ComidaPerros fragment = new ComidaPerros();
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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comida_perros, container, false);

        mlsvComida = view.findViewById(R.id.lvLista);

        mList.removeAll(mList);
        mList.add(new Modelo(getString(R.string.descripcion1P),getString(R.string.p1P),R.drawable.pedigree));
        mList.add(new Modelo(getString(R.string.descripcion2P),getString(R.string.p2P),R.drawable.pedigree2));
        mList.add(new Modelo(getString(R.string.descripcion3P),getString(R.string.p3P),R.drawable.dogui));
        mList.add(new Modelo(getString(R.string.descripcion4P),getString(R.string.p4P),R.drawable.dogui2));
        mList.add(new Modelo(getString(R.string.descripcion5P),getString(R.string.p5P),R.drawable.dogchow));

        mAdapter = new Adapter(getContext(),R.layout.plantilla,mList);
        mlsvComida.setAdapter(mAdapter);
        return view;
    }
}