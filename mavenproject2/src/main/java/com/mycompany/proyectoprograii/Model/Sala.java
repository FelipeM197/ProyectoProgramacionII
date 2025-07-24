package com.mycompany.proyectoprograii;

public class Sala implements ISala{
    private String id;
    private String nombre;
    private int capacidad;

    public Sala(String id, String nombre, int capacidad){
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public String obtenerId(){
        return id;
    }

    @Override
    public int contarAsientosDisponibles(){
        return capacidad; //me imagino que returnea capacidad sioq
    }

}