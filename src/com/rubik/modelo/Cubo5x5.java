package com.rubik.modelo;

public class Cubo5x5 {

    private final Cara cara1;
    private final Cara cara2;
    private final Cara cara3;
    private final Cara cara4;
    private final Cara cara5;
    private final Cara cara6;
    
    public Cubo5x5(){
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
     * @param numFila El numero de fila que se desea girar, comenzando desde 0
     */
    public void girarFila_D(int numFila){
        if (numFila == 0)
            rotarSuperior('R'); //Rigth
        else if(numFila == 3)
            rotarInferior('R');
        
        char[] filaCara1 = cara1.getFila(numFila);
        char[] filaCara2 = cara2.getFila(numFila);
        char[] filaCara3 = cara3.getFila(numFila);
        char[] filaCara6 = cara6.getFila(numFila);
        
        cara1.cambiarFila(numFila, filaCara2);
        cara2.cambiarFila(numFila, filaCara6);
        cara6.cambiarFila(numFila, filaCara3);
        cara3.cambiarFila(numFila, filaCara1);
    }
    
    /**
     * Gira una determinada fila a la izquierda. Si se gira la fila 0 o la 1, las caras anexas superior o inferior tambien se ven 
     * afectadas, por tanto se debe hacer una comprobacion
     * @param numFila El numero de fila que se desea girar, comenzando desde 0
     */
    public void girarFila_I(int numFila){
        if (numFila == 0)
            rotarSuperior('L'); //Left
        else if(numFila == 3)
            rotarInferior('L'); //Left
        
        char[] filaCara1 = cara1.getFila(numFila);
        char[] filaCara2 = cara2.getFila(numFila);
        char[] filaCara3 = cara3.getFila(numFila);
        char[] filaCara6 = cara6.getFila(numFila);
       
        cara1.cambiarFila(numFila, filaCara3);
        cara3.cambiarFila(numFila, filaCara6);
        cara6.cambiarFila(numFila, filaCara2);
        cara2.cambiarFila(numFila, filaCara1);
    } 
    
    /**
     * Este metodo se encarga de girar una columna hacia abajo. Si se gira la columna 0 o 2, llama al metodo encargado de 
     * rotar las caras conjuntas a la columna
     * @param numColumna el numero de columna que se desea rotar, comenzando desde 0
     */
    public void girarColumna_Abajo(int numColumna){
        /**
         * En este caso la cara frontal y lateral no comparten ningun indice, por lo cual se tienen que evaluar todos 
         * los numeros de columna para hacer su equivalente por la columna trasera
         */
        int trasera = 0; 
        
        if(numColumna == 0){
           trasera = 3;
           rotarLateral_I('D'); //parametro 'D' Down 
        }
        else if(numColumna == 1)
            trasera = 2;
        else if(numColumna == 2)
            trasera = 1;
        else if(numColumna == 3){
            trasera = 0;
            rotarLateral_D('D'); //parametro 'D' Down 
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
     * @param numColumna el numero de columna que se desea rotar, comenzando desde 0
     */
    public void girarColumna_Arriba(int numColumna){
         /**
         * En este caso la cara frontal y lateral no comparten ningun indice, por lo cual se tienen que evaluar todos 
         * los numeros de columna para hacer su equivalente por la columna trasera
         */
        int trasera = 0; 
        
        if(numColumna == 0){
           trasera = 3;
           rotarLateral_I('U'); //parametro 'U' Up
        }
        else if(numColumna == 1)
            trasera = 2;
        else if(numColumna == 2)
            trasera = 1;
        else if(numColumna == 3){
            trasera = 0;
            rotarLateral_D('U'); //parametro 'U' Up
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
    
    public void girarCubo_Arriba(){
        girarColumna_Arriba(0);
        girarColumna_Arriba(1);
        girarColumna_Arriba(2);
        girarColumna_Arriba(3);
    }
    
    public void girarCubo_Abajo(){
        girarColumna_Abajo(0);
        girarColumna_Abajo(1);
        girarColumna_Abajo(2);
        girarColumna_Abajo(3);
    }
    
    public void girarCubo_D(){
        girarFila_D(0);
        girarFila_D(1);
        girarFila_D(2);
        girarFila_D(3);
    }
    
    public void girarCubo_I(){
        girarFila_I(0);
        girarFila_I(1);
        girarFila_I(2);
        girarFila_I(3);
    }
    
    /**
     * Este metodo sera llamado cuando se gira la columna 3 del cubo, pues la cara 3, (la que esta junta a la columna, por la derecha)
    tambien se ve afectada
     * @param sentido Es el sentido de rotacion D --> Down (la columna se gira hacia abajo) U --> Up (la columna se gira hacia arriba)
     */
    private void rotarLateral_D(char sentido){       
        if(sentido == 'D'){ //U --> Up. D --> Down
            char[] v_col0 = cara3.getColumna(0);
            char[] v_col1 = cara3.getColumna(1);
            char[] v_col2 = cara3.getColumna(2);
            char[] v_col3 = cara3.getColumna(3);
            cara3.cambiarFila(0, v_col3);
            cara3.cambiarFila(1, v_col2);
            cara3.cambiarFila(2, v_col1);
            cara3.cambiarFila(3, v_col0);
        }else{
            char[] v_fila0 = cara3.getFila(0);
            char[] v_fila1 = cara3.getFila(1);
            char[] v_fila2 = cara3.getFila(2);
            char[] v_fila3 = cara3.getFila(3);
            cara3.cambiarColumna(0, v_fila3);
            cara3.cambiarColumna(1, v_fila2);
            cara3.cambiarColumna(2, v_fila1);
            cara3.cambiarColumna(3, v_fila0);
        }
    }
    
    /**
     * Este metodo sera llamado cuando se gira la columna 0 del cubo, pues la cara 2, (la que esta junta a la columna, por la izquierda)
    tambien se ve afectada
     * @param sentido Es el sentido de rotacion D --> Down (la columna se gira hacia abajo) U --> Up (la columna se gira hacia arriba)
     */
    private void rotarLateral_I(char sentido){
        if(sentido == 'D'){//U --> Up. D --> Down
            char[] v_fila0 = cara2.getFila(0);
            char[] v_fila1 = cara2.getFila(1);
            char[] v_fila2 = cara2.getFila(2);
            char[] v_fila3 = cara2.getFila(3);
            cara2.cambiarColumna(0, v_fila3);
            cara2.cambiarColumna(1, v_fila2);
            cara2.cambiarColumna(2, v_fila1);
            cara2.cambiarColumna(3, v_fila0);
        }else{
            char[] v_col0 = cara2.getColumna(0);
            char[] v_col1 = cara2.getColumna(1);
            char[] v_col2 = cara2.getColumna(2);
            char[] v_col3 = cara2.getColumna(3);
            cara2.cambiarFila(0, v_col3);
            cara2.cambiarFila(1, v_col2);
            cara2.cambiarFila(2, v_col1);
            cara2.cambiarFila(3, v_col0);
        }
    }
    
    /**
     * Este metodo sera llamado cuando se gira la fila 0 del cubo, pues la cara 5, (la que esta junta a la fila, por arriba)
    tambien se ve afectada
     * @param sentido Es el sentido de rotacion R --> Rigth (la fila se gira a la derecha) L --> Left (la fila se gira a la izquierda)
     */
    private void rotarSuperior(char sentido){
        if(sentido == 'R')
        {
            char[] v_col0 = cara5.getColumna(0);
            char[] v_col1 = cara5.getColumna(1);
            char[] v_col2 = cara5.getColumna(2);
            char[] v_col3 = cara5.getColumna(3);
            cara5.cambiarFila(0, v_col3);
            cara5.cambiarFila(1, v_col2);
            cara5.cambiarFila(2, v_col1);
            cara5.cambiarFila(3, v_col0);           
        }else{            
            char[] v_fila0 = cara5.getFila(0);
            char[] v_fila1 = cara5.getFila(1);
            char[] v_fila2 = cara5.getFila(2);
            char[] v_fila3 = cara5.getFila(3);
            cara5.cambiarColumna(0, v_fila3);
            cara5.cambiarColumna(1, v_fila2);
            cara5.cambiarColumna(2, v_fila1);
            cara5.cambiarColumna(3, v_fila0);
        }
    }
    
    /**
     * Este metodo sera llamado cuando se gira la fila 3 del cubo, pues la cara 4, (la que esta junta a la fila, por abajo)
    tambien se ve afectada
     * @param sentido Es el sentido de rotacion R --> Rigth (la fila se gira a la derecha) L --> Left (la fila se gira a la izquierda)
     */
    private void rotarInferior(char sentido){
        if(sentido == 'R'){
            char[] v_fila0 = cara4.getFila(0);
            char[] v_fila1 = cara4.getFila(1);
            char[] v_fila2 = cara4.getFila(2);
            char[] v_fila3 = cara4.getFila(3);
            cara4.cambiarColumna(0, v_fila3);
            cara4.cambiarColumna(1, v_fila2);
            cara4.cambiarColumna(2, v_fila1);
            cara4.cambiarColumna(3, v_fila0);
        }else{
            char[] v_col0 = cara4.getColumna(0);
            char[] v_col1 = cara4.getColumna(1);
            char[] v_col2 = cara4.getColumna(2);
            char[] v_col3 = cara4.getColumna(3);
            cara4.cambiarFila(0, v_col3);
            cara4.cambiarFila(1, v_col2);
            cara4.cambiarFila(2, v_col1);
            cara4.cambiarFila(3, v_col0);     
        }
    }
    
    /**
     * Este metodo sera llamado cuando una columna del cubo se gire hacia abajo o hacia arriba, pues la columna trasera se gira, 
     * pero de manera traspuesta en sus indices, es necesario voltearla
     * @param columna : Columna que se desea trasponer
     */
    private char[] voltearColumna(char columna[]){
        char aux0, aux1;
        aux0 = columna[0];
        aux1 = columna[1];
        
        columna[0] = columna[3];
        columna[3] = aux0;
        columna[1] = columna[2];
        columna[2] = aux1;
        
        return columna;
    }
    
    public void mostrarCubo(){
        String espacios = "       "; // 7 espacios
        System.out.println(espacios+cara5.getCadenaFila(0));
        System.out.println(espacios+cara5.getCadenaFila(1));
        System.out.println(espacios+cara5.getCadenaFila(2));
        System.out.println("");
        
        System.out.println(cara2.getCadenaFila(0) +" "+ cara1.getCadenaFila(0) +" "+ cara3.getCadenaFila(0));
        System.out.println(cara2.getCadenaFila(1) +" "+ cara1.getCadenaFila(1) +" "+ cara3.getCadenaFila(1));
        System.out.println(cara2.getCadenaFila(2) +" "+ cara1.getCadenaFila(2) +" "+ cara3.getCadenaFila(2));
        System.out.println("");
        
        System.out.println(espacios+cara4.getCadenaFila(0));
        System.out.println(espacios+cara4.getCadenaFila(1));
        System.out.println(espacios+cara4.getCadenaFila(2));
        System.out.println("");
        
        System.out.println(espacios+cara6.getCadenaFila(0));
        System.out.println(espacios+cara6.getCadenaFila(1));
        System.out.println(espacios+cara6.getCadenaFila(2));
    }
    
    /**
     * Metodo encargado de retornar la matriz que representa la cara frontal, para efectos de la GUI
     * @return char[][] matriz que representa la cara frontal
     */
    public Cara getCara1(){
        return cara1;
    }
    
    public Cara getCara2(){
        return cara2;
    }    
    
    public Cara getCara3(){
        return cara3;
    }
    
    public Cara getCara4(){
        return cara4;
    }
  
    public Cara getCara5(){
        return cara5;
    }    
    
    public Cara getCara6(){
        return cara6;
    }
}
