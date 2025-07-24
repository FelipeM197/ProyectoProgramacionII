package com.mycompany.proyectoprograii;

public class Pelicula implements IPelicula{
    private String id;
    private String titulo;
    private String genero;
    private int duracion;
    private int restriccionEdad;

    public Pelicula(String id, String titulo, String genero, int duracion, int restriccionEdad){
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.restriccionEdad = restriccionEdad;
    }

    @Override
    public String obtenerTitulo(){
        return titulo;
    }

    @Override
    public String obtenerGenero(){
        return genero;
    }

    @Override
    public int obtenerDuracion(){
        return duracion;
    }

    @Override
    public int obtenerRestriccionEdad(){
        return restriccionEdad;
    }

}