package com.example.mascotas;

public class ComidaModelo {

    private int titulo,categoria,descripcion;

    public ComidaModelo() {
    }

    public ComidaModelo(int categoria, int titulo, int descripcion) {
        this.categoria = categoria;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

}
