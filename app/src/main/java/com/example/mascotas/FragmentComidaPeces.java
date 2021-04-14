package com.example.mascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentComidaPeces#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentComidaPeces extends Fragment {

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
    public FragmentComidaPeces() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentComidaPeces.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentComidaPeces newInstance(String param1, String param2) {
        FragmentComidaPeces fragment = new FragmentComidaPeces();
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
        View view = inflater.inflate(R.layout.fragment_comida_peces, container, false);

        mlsvComida = view.findViewById(R.id.lvLista);
        mList.removeAll(mList);
        mList.add(new Modelo(getString(R.string.descripcion1Pe),getString(R.string.p1Pe),R.drawable.peces));
        mList.add(new Modelo(getString(R.string.descripcion2Pe),getString(R.string.p2Pe),R.drawable.peces2));
        mList.add(new Modelo(getString(R.string.descripcion3Pe),getString(R.string.p3Pe),R.drawable.peces3));
        mList.add(new Modelo(getString(R.string.descripcion4Pe),getString(R.string.p4Pe),R.drawable.peces4));
        mList.add(new Modelo(getString(R.string.descripcion5Pe),getString(R.string.p5Pe),R.drawable.peces5));

        mAdapter = new Adapter(getContext(),R.layout.plantilla,mList);
        mlsvComida.setAdapter(mAdapter);

        return view ;
    }
}