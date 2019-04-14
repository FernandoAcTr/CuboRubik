package com.rubik.modelo;

/**
 * Clase que maneja arreglos simultaneos, para estructurar las tuplas (color,orientacion_del_color)
 */
public class Tupla {
    public char color[];
    public char orientacion[];

    public Tupla(int numTuplas){
        color = new char[numTuplas];
        orientacion = new char[numTuplas];
    }
}
