package com.rubik.modelo;

public class Main {
    public static void main(String[] args){
        Cubo cubo = new Cubo();

        System.out.println("Estado Original");
        cubo.imprimePiezas();

        cubo.movCruzFrontal(1);
        System.out.println("Cubo rotado");
        cubo.imprimePiezas();
    }
}
