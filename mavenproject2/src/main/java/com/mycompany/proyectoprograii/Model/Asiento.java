package com.mycompany.proyectoprograii;


public abstract class Asiento {
    private String numero;
    private boolean estado;
    
    public Asiento(String numero, boolean estado){
        this.numero = numero;
        this.estado = estado;
    }
    
    public String obtenerNumero(){
        return numero;
    }
    
    public boolean obtenerEstado(){
        return estado;
    }
    
    public void reservar(){
        System.out.println("Asiento Reservado.");
    }
    
    public void liberar(){
        System.out.println("Asiento Liberado.");
    }
    
    public double obtenerPrecio(double base){
        return base;
    }
}