package com.example.mascotas;

import android.graphics.drawable.Drawable;

public class Modelo {
    private  String precio, detalles;
    private int icon;
    private  Drawable icon1;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Drawable getIcon1() {
        return icon1;
    }

    public void setIcon1(Drawable icon1) {
        this.icon1 = icon1;
    }

    public Modelo(String precio, String detalles, int icon) {
        this.precio = precio;
        this.detalles = detalles;
        this.icon = icon;
    }

    public Modelo() {
    }


}
