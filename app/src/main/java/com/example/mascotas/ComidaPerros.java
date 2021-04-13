package com.example.mascotas;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

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

        btnAdd = view.findViewById(R.id.btnAdd);
        btnAdd1 = view.findViewById(R.id.btnAdd1);
        btnAdd2 = view.findViewById(R.id.btnAdd2);
        btnAdd3 = view.findViewById(R.id.btnAdd3);
        btnAdd4 = view.findViewById(R.id.btnAdd4);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Información");
                builder.setMessage("Se ha añadido al carrito");
                builder.setPositiveButton("Aceptar",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Información");
                builder.setMessage("Se ha añadido al carrito");
                builder.setPositiveButton("Aceptar",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Información");
                builder.setMessage("Se ha añadido al carrito");
                builder.setPositiveButton("Aceptar",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Información");
                builder.setMessage("Se ha añadido al carrito");
                builder.setPositiveButton("Aceptar",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });btnAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Información");
                builder.setMessage("Se ha añadido al carrito");
                builder.setPositiveButton("Aceptar",null);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        return view;
    }
}