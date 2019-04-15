package com.rubik.modelo;

public class Cubo5x5 {

    private final Cara cara1;
    private final Cara cara2;
    private final Cara cara3;
    private final Cara cara4;
    private final Cara cara5;
    private final Cara cara6;
    
    public static final char ANTIHORARIO = 'A';
    public static final char HORARIO = 'H';

    public Cubo5x5() {
        cara1 = new Cara('W'); //White
        cara2 = new Cara('G'); //Green
        cara3 = new Cara('B'); //Blue
        cara4 = new Cara('R'); //Red
        cara5 = new Cara('O'); //Orange
        cara6 = new Cara('Y'); //Yellow
    }

    /**
     * Gira una determinada fila a la derecha. Si se gira la fila 0 o la 1, las caras anexas superior o inferior tambien se ven
     * afectadas, por tanto se debe hacer una comprobacion
     *
     * @param numFila El numero de fila que se desea girar, comenzando desde 0
     */
    public void girarFila_D(int numFila) {
        if (numFila == 0)
            trasponerCara(cara5, HORARIO);
        else if (numFila == 4)
            trasponerCara(cara4, ANTIHORARIO); //mientras la fila inferior gira horario, la cara anexa se gira antihorario. Comprobar con un cubo real

        char[] filaCara1 = cara1.getFila(numFila);
        char[] filaCara2 = cara2.getFila(numFila);
        char[] filaCara3 = cara3.getFila(numFila);
        char[] filaCara6 = cara6.getFila(numFila);

        cara1.cambiarFila(numFila, filaCara3);
        cara2.cambiarFila(numFila, filaCara1);
        cara6.cambiarFila(numFila, filaCara2);
        cara3.cambiarFila(numFila, filaCara6);
    }

    /**
     * Gira una determinada fila a la izquierda. Si se gira la fila 0 o la 1, las caras anexas superior o inferior tambien se ven
     * afectadas, por tanto se debe hacer una comprobacion
     *
     * @param numFila El numero de fila que se desea girar, comenzando desde 0
     */
    public void girarFila_I(int numFila) {
        if (numFila == 0)
            trasponerCara(cara5, ANTIHORARIO);
        else if (numFila == 3)
            trasponerCara(cara4, HORARIO);  //mientras la fila inferior gira antihorario, la cara anexa se gira horario. Comprobar con un cubo real

        char[] filaCara1 = cara1.getFila(numFila);
        char[] filaCara2 = cara2.getFila(numFila);
        char[] filaCara3 = cara3.getFila(numFila);
        char[] filaCara6 = cara6.getFila(numFila);

        cara1.cambiarFila(numFila, filaCara2);
        cara3.cambiarFila(numFila, filaCara1);
        cara6.cambiarFila(numFila, filaCara3);
        cara2.cambiarFila(numFila, filaCara6);
    }

    /**
     * Este metodo se encarga de girar una columna hacia abajo. Si se gira la columna 0 o 2, llama al metodo encargado de
     * rotar las caras conjuntas a la columna
     *
     * @param numColumna el numero de columna que se desea rotar, comenzando desde 0
     */
    public void girarColumna_Abajo(int numColumna) {
        /**
         * En este caso la cara frontal y lateral no comparten ningun indice, por lo cual se tienen que evaluar todos 
         * los numeros de columna para hacer su equivalente por la columna trasera
         */
        int trasera = 0;

        if (numColumna == 0) {
            trasera = 4;
            trasponerCara(cara2, HORARIO);
        } else if (numColumna == 1)
            trasera = 3;
        else if (numColumna == 2)
            trasera = 2;
        else if (numColumna == 3)
            trasera = 1;
        else if (numColumna == 4) {
            trasera = 0;
            trasponerCara(cara3, ANTIHORARIO);
        }

        char[] colCara1 = cara1.getColumna(numColumna);
        char[] colCara4 = cara4.getColumna(numColumna);
        char[] colCara5 = cara5.getColumna(numColumna);
        char[] colCara6 = cara6.getColumna(trasera);

        cara1.cambiarColumna(numColumna, colCara5);
        cara5.cambiarColumna(numColumna, voltearColumna(colCara6));
        cara6.cambiarColumna(trasera, voltearColumna(colCara4));
        cara4.cambiarColumna(numColumna, colCara1);
    }

    /**
     * Este metodo se encarga de girar una columna hacia arriba. Si se gira la columna 0 o 2, llama al metodo encargado de
     * rotar las caras conjuntas a la columna
     *
     * @param numColumna el numero de columna que se desea rotar, comenzando desde 0
     */
    public void girarColumna_Arriba(int numColumna) {
        /**
         * En este caso la cara frontal y lateral no comparten ningun indice, por lo cual se tienen que evaluar todos 
         * los numeros de columna para hacer su equivalente por la columna trasera
         */
        int trasera = 0;

        if (numColumna == 0) {
            trasera = 4;
            trasponerCara(cara2, ANTIHORARIO);
        } else if (numColumna == 1)
            trasera = 3;
        else if (numColumna == 2)
            trasera = 3;
        else if (numColumna == 3)
            trasera = 1;
        else if (numColumna == 4) {
            trasera = 0;
            trasponerCara(cara3, HORARIO);
        }

        char[] colCara1 = cara1.getColumna(numColumna);
        char[] colCara4 = cara4.getColumna(numColumna);
        char[] colCara5 = cara5.getColumna(numColumna);
        char[] colCara6 = cara6.getColumna(trasera);

        cara1.cambiarColumna(numColumna, colCara4);
        cara4.cambiarColumna(numColumna, voltearColumna(colCara6));
        cara6.cambiarColumna(trasera, voltearColumna(colCara5));
        cara5.cambiarColumna(numColumna, colCara1);
    }

    public void girarCubo_Arriba() {

        for (int i = 0; i < Cara.NUM_FILAS; i++)
            girarColumna_Arriba(i);

    }

    public void girarCubo_Abajo() {
        for (int i = 0; i < Cara.NUM_FILAS; i++)
            girarColumna_Abajo(i);
    }

    public void girarCubo_D() {
        for (int i = 0; i < Cara.NUM_FILAS; i++)
            girarFila_D(i);
    }

    public void girarCubo_I() {

        for (int i = 0; i < Cara.NUM_FILAS; i++)
            girarFila_I(i);

    }

    /**
     * Este metodo sera llamado cuando una columna del cubo se gire hacia abajo o hacia arriba, pues la columna trasera se gira,
     * pero de manera traspuesta en sus indices, es necesario voltearla
     *
     * @param columna : Columna que se desea trasponer
     */
    private char[] voltearColumna(char columna[]) {
        int i, j;
        char[] auxCol = new char[columna.length];

        for (i = 0, j = columna.length - 1; i < columna.length; i++, j--)
            auxCol[j] = columna[i];


        return auxCol;
    }

    public void mostrarCubo() {
        String espacios = "           "; // 11 espacios

        System.out.println(espacios + cara5.getCadenaFila(0));
        System.out.println(espacios + cara5.getCadenaFila(1));
        System.out.println(espacios + cara5.getCadenaFila(2));
        System.out.println(espacios + cara5.getCadenaFila(3));
        System.out.println(espacios + cara5.getCadenaFila(4));
        System.out.println("");

        System.out.println(cara2.getCadenaFila(0) + " " + cara1.getCadenaFila(0) + " " + cara3.getCadenaFila(0) + " " + cara6.getCadenaFila(0));
        System.out.println(cara2.getCadenaFila(1) + " " + cara1.getCadenaFila(1) + " " + cara3.getCadenaFila(1) + " " + cara6.getCadenaFila(1));
        System.out.println(cara2.getCadenaFila(2) + " " + cara1.getCadenaFila(2) + " " + cara3.getCadenaFila(2) + " " + cara6.getCadenaFila(2));
        System.out.println(cara2.getCadenaFila(3) + " " + cara1.getCadenaFila(3) + " " + cara3.getCadenaFila(3) + " " + cara6.getCadenaFila(3));
        System.out.println(cara2.getCadenaFila(4) + " " + cara1.getCadenaFila(4) + " " + cara3.getCadenaFila(4) + " " + cara6.getCadenaFila(4));
        System.out.println("");

        System.out.println(espacios + cara4.getCadenaFila(0));
        System.out.println(espacios + cara4.getCadenaFila(1));
        System.out.println(espacios + cara4.getCadenaFila(2));
        System.out.println(espacios + cara4.getCadenaFila(3));
        System.out.println(espacios + cara4.getCadenaFila(4));
        System.out.println("");

    }

    /**
     * Traspone la matriz de una cara en sentido antiorario u horario.
     * Tal como es la traspuesta de una matriz, cambiar filas por columnas y viceversa
     *
     * @param cara    la cara a ser traspuesta
     * @param sentido 'H' Horario 'A' antohirario
     */
    private void trasponerCara(Cara cara, char sentido) {
        if (sentido == HORARIO) {
            char[] v_col0 = cara.getColumna(0);
            char[] v_col1 = cara.getColumna(1);
            char[] v_col2 = cara.getColumna(2);
            char[] v_col3 = cara.getColumna(3);
            char[] v_col4 = cara.getColumna(4);

            cara.cambiarFila(0, v_col0);
            cara.cambiarFila(1, v_col1);
            cara.cambiarFila(2, v_col2);
            cara.cambiarFila(3, v_col3);
            cara.cambiarFila(4, v_col4);
        } else {
            char[] v_fila0 = cara.getFila(0);
            char[] v_fila1 = cara.getFila(1);
            char[] v_fila2 = cara.getFila(2);
            char[] v_fila3 = cara.getFila(3);
            char[] v_fila4 = cara.getFila(3);

            cara.cambiarColumna(0, v_fila0);
            cara.cambiarColumna(1, v_fila1);
            cara.cambiarColumna(2, v_fila2);
            cara.cambiarColumna(3, v_fila3);
            cara.cambiarColumna(4, v_fila4);
        }
    }

    /**
     * Metodo encargado de retornar la matriz que representa la cara frontal, para efectos de la GUI
     *
     * @return char[][] matriz que representa la cara frontal
     */
    public Cara getCara1() {
        return cara1;
    }

    public Cara getCara2() {
        return cara2;
    }

    public Cara getCara3() {
        return cara3;
    }

    public Cara getCara4() {
        return cara4;
    }

    public Cara getCara5() {
        return cara5;
    }

    public Cara getCara6() {
        return cara6;
    }
}
