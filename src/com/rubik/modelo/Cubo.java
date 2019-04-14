package com.rubik.modelo;

public class Cubo {

    private final Cara cara1;
    private final Cara cara2;
    private final Cara cara3;
    private final Cara cara4;
    private final Cara cara5;
    private final Cara cara6;
    
    public final static char UP_ORIENTATION = 'U';
    public final static char DOWN_ORIENTATION = 'D';
    public final static char LEFT_ORIENTATION = 'L';
    public final static char RIGTH_ORIENTATION = 'R';
    
    public Cubo(){
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
        else if(numFila == 2)
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
        else if(numFila == 2)
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
         * Se inicia una variable "trasera" con el indice que la cara frontal y la lateral compraten (1), debido a que
         * la columna 0 frontal, es la 1 trasera y viceversa, se debe hacer un cambio
         */
        int trasera = 1; 
        
        if(numColumna == 2){
           trasera = 0;
           rotarLateral_D('D');
        }
        else if(numColumna == 0){
            trasera = 2;
            rotarLateral_I('D');
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
         * Se inicia una variable "trasera" con el indice que la cara frontal y la lateral compraten (1), debido a que
         * la columna 0 frontal, es la 1 trasera y viceversa, se debe hacer un cambio
         */
        int trasera = 1; 
        
        if(numColumna == 2){
            trasera = 0;
           rotarLateral_D('U');
        }
        else if(numColumna == 0){
            trasera = 2;
            rotarLateral_I('U');
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
    }
    
    public void girarCubo_Abajo(){
        girarColumna_Abajo(0);
        girarColumna_Abajo(1);
        girarColumna_Abajo(2);
    }
    
    public void girarCubo_D(){
        girarFila_D(0);
        girarFila_D(1);
        girarFila_D(2);
    }
    
    public void girarCubo_I(){
        girarFila_I(0);
        girarFila_I(1);
        girarFila_I(2);
    }
    
    /**
     * Este metodo sera llamado cuando se gira la columna 2 del cubo, pues la cara 3, (la que esta junta a la columna, por la derecha)
    tambien se ve afectada
     * @param sentido Es el sentido de rotacion D --> Down (la columna se gira hacia abajo) U --> Up (la columna se gira hacia arriba)
     */
    private void rotarLateral_D(char sentido){       
        if(sentido == 'D'){ //U --> Up. D --> Down
            char[] v_col0 = cara3.getColumna(0);
            char[] v_col1 = cara3.getColumna(1);
            char[] v_col2 = cara3.getColumna(2);
            cara3.cambiarFila(0, v_col2);
            cara3.cambiarFila(1, v_col1);
            cara3.cambiarFila(2, v_col0);
        }else{
            char[] v_fila0 = cara3.getFila(0);
            char[] v_fila1 = cara3.getFila(1);
            char[] v_fila2 = cara3.getFila(2);
            cara3.cambiarColumna(0, v_fila2);
            cara3.cambiarColumna(1, v_fila1);
            cara3.cambiarColumna(2, v_fila0);
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
            cara2.cambiarColumna(0, v_fila2);
            cara2.cambiarColumna(1, v_fila1);
            cara2.cambiarColumna(2, v_fila0);
        }else{
            char[] v_col0 = cara2.getColumna(0);
            char[] v_col1 = cara2.getColumna(1);
            char[] v_col2 = cara2.getColumna(2);
            cara2.cambiarFila(0, v_col2);
            cara2.cambiarFila(1, v_col1);
            cara2.cambiarFila(2, v_col0);
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
            cara5.cambiarFila(0, v_col2);
            cara5.cambiarFila(1, v_col1);
            cara5.cambiarFila(2, v_col0);            
        }else{            
            char[] v_fila0 = cara5.getFila(0);
            char[] v_fila1 = cara5.getFila(1);
            char[] v_fila2 = cara5.getFila(2);
            cara5.cambiarColumna(0, v_fila2);
            cara5.cambiarColumna(1, v_fila1);
            cara5.cambiarColumna(2, v_fila0);
        }
    }
    
    /**
     * Este metodo sera llamado cuando se gira la fila 2 del cubo, pues la cara 4, (la que esta junta a la fila, por abajo)
    tambien se ve afectada
     * @param sentido Es el sentido de rotacion R --> Rigth (la fila se gira a la derecha) L --> Left (la fila se gira a la izquierda)
     */
    private void rotarInferior(char sentido){
        if(sentido == 'R'){
            char[] v_fila0 = cara4.getFila(0);
            char[] v_fila1 = cara4.getFila(1);
            char[] v_fila2 = cara4.getFila(2);
            cara4.cambiarColumna(0, v_fila2);
            cara4.cambiarColumna(1, v_fila1);
            cara4.cambiarColumna(2, v_fila0);
        }else{
            char[] v_col0 = cara4.getColumna(0);
            char[] v_col1 = cara4.getColumna(1);
            char[] v_col2 = cara4.getColumna(2);
            cara4.cambiarFila(0, v_col2);
            cara4.cambiarFila(1, v_col1);
            cara4.cambiarFila(2, v_col0);    
        }
    }
    
    /**
     * Este metodo sera llamado cuando una columna del cubo se gire hacia abajo o hacia arriba, pues la columna trasera se gira, 
     * pero de manera traspuesta en sus indices, es necesario voltearla
     * @param columna : Columna que se desea trasponer
     */
    private char[] voltearColumna(char columna[]){
        char aux;
        aux = columna[0];
        columna[0] = columna[2];
        columna[2] = aux;
        
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
     * Metodo encargado de retornar la matriz que representa la cara frontal, para efector de la GUI
     * @return char[][] matriz que representa la cara frontal
     */
    public Cara getCaraFrontal(){
        return cara1;
    }
}
