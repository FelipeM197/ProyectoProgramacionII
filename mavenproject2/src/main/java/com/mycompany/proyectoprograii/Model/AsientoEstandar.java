package com.mycompany.proyectoprograii;

public class AsientoEstandar extends Asiento{

    //Llamamos al constructor de la clase padre Asiento.
    public AsientoEstandar(String numero, boolean estado){
        super(numero, estado);

    }


    //Sobreescribimos el método.
    @Override
    public double obtenerPrecio(double base){
        return base;
    }
    
}