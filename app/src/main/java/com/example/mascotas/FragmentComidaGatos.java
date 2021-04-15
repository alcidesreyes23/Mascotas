package com.example.mascotas;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentComidaGatos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentComidaGatos extends Fragment{

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

    public FragmentComidaGatos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentComidaGatos.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentComidaGatos newInstance(String param1, String param2) {
        FragmentComidaGatos fragment = new FragmentComidaGatos();
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
        View view = inflater.inflate(R.layout.fragment_comida_gatos, container, false);

        mlsvComida = view.findViewById(R.id.lvLista);

        mList.removeAll(mList);
        mList.add(new Modelo(getString(R.string.descripcion1),getString(R.string.p1),R.drawable.gati));
        mList.add(new Modelo(getString(R.string.descripcion2),getString(R.string.p2),R.drawable.gati2));
        mList.add(new Modelo(getString(R.string.descripcion3),getString(R.string.p3),R.drawable.whiskas));
        mList.add(new Modelo(getString(R.string.descripcion4),getString(R.string.p4),R.drawable.whiskas2));
        mList.add(new Modelo(getString(R.string.descripcion5),getString(R.string.p5),R.drawable.felix));

        mAdapter = new Adapter(getContext(),R.layout.plantilla,mList);
        mlsvComida.setAdapter(mAdapter);

        return view ;
    }
}