package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity{

   ComidaPerros comidaPerros;
   FragmentComidaGatos comidaGatos;
   FragmentComidaAves comidaAves;
   FragmentComidaPeces comidaPeces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        comidaGatos = new FragmentComidaGatos();
        comidaPerros = new ComidaPerros();
        comidaAves = new FragmentComidaAves();
        comidaPeces = new FragmentComidaPeces();

       getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,comidaGatos).commit();

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
                transaction.addToBackStack(null);
                break;
            case R.id.btnFragmentTres:
                transaction.replace(R.id.frlContenedor,comidaPeces);
                transaction.addToBackStack(null);
                break;
            case R.id.btnFragmentCuatro:
                transaction.replace(R.id.frlContenedor,comidaAves);
                transaction.addToBackStack(null);
                break;
        }
        transaction.commit();
    }
}