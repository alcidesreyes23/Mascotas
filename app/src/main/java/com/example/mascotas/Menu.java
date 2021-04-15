package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Menu extends AppCompatActivity{

   ComidaPerros comidaPerros;
   FragmentComidaGatos comidaGatos;
   FragmentComidaAves comidaAves;
   FragmentComidaPeces comidaPeces;
   Button btnPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        comidaGatos = new FragmentComidaGatos();
        comidaPerros = new ComidaPerros();
        comidaAves = new FragmentComidaAves();
        comidaPeces = new FragmentComidaPeces();

       getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,comidaGatos).commit();
       btnPagar = findViewById(R.id.btnPagar);
       btnPagar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               // 2. Mensaje de confirmacion
               new SweetAlertDialog(Menu.this, SweetAlertDialog.WARNING_TYPE)
                       .setTitleText("Compra")
                       .setContentText("¿Desea procesar la compra?")
                       .setConfirmText("Si")
                       .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                           @Override
                           public void onClick(SweetAlertDialog sDialog) {
                               Intent nextA = new Intent(Menu.this,Compra.class);
                               startActivity(nextA);
                               sDialog.dismissWithAnimation();
                           }
                       })
                       .setCancelButton("No", new SweetAlertDialog.OnSweetClickListener() {
                           @Override
                           public void onClick(SweetAlertDialog sDialog) {
                               sDialog.dismissWithAnimation();
                           }
                       })
                       .show();
           }
       });

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
            case R.id.btnAdd:
                new SweetAlertDialog(Menu.this)
                        .setTitleText("¡Producto en carrito!")
                        .setConfirmText("Aceptar")
                        .show();
                break;
        }
        transaction.commit();
    }
}