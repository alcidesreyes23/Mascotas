package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity{

   ComidaGatos comidaGatos;
   ComidaPerros comidaPerros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        comidaGatos = new ComidaGatos();
        comidaPerros = new ComidaPerros();

       getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,comidaPerros).commit();

    }

    public  void  onClick(View view)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId())
        {
            case R.id.btnFragmentUno:
                transaction.replace(R.id.frlContenedor,comidaGatos);
                transaction.addToBackStack(null);
                break;
            case R.id.btnFragmentDos:
                transaction.replace(R.id.frlContenedor,comidaPerros);
                break;
            case R.id.btnFragmentTres:
                transaction.replace(R.id.frlContenedor,comidaGatos);
                break;
            case R.id.btnFragmentCuatro:
                transaction.replace(R.id.frlContenedor,comidaGatos);
                break;
        }
        transaction.commit();
    }
}