package modelo;

public class Cara {
    private final char[][] colores;
    public static final byte NUM_FILAS = 5;
    
    /**
     * Inicia la matriz de colores con el color que se le pase como argumento
     * @param color El color de la cara
     */
    public Cara(char color){
        colores = new char[NUM_FILAS][NUM_FILAS];
        for(int i= 0; i<NUM_FILAS; i++)
            for(int j=0; j<NUM_FILAS; j++)
                colores[i][j] = color;
    }   
    
    /**
     * Cambia una determinada columna de la cara(matriz) por los colores de la columna como argumento
     * @param numColumna el numero de columna que se quiere cambiar
     * @param columna los colores que conteiene la nueva columna
     */
    public void cambiarColumna(int numColumna, char[] columna){
        for(int fila= 0; fila<NUM_FILAS; fila++)
            colores[fila][numColumna] = columna[fila];        
    }
    
    /**
     *  Cambia una determinada fila de la cara(matriz) por los colores de la fila como argumento
     * @param numFila el nuermo de fila que se quiere cambiar
     * @param fila los colores de la nueva fila
     */
    public void cambiarFila(int numFila, char fila[]){
        for(int columna= 0; columna<NUM_FILAS; columna++)
            colores[numFila][columna] = fila[columna];          
    }
    
    /**
     * Returna una determinada fila de la matriz como un vector
     * @param numFila el nuermo de fila que se desea obtener
     * @return vector que representa una fila
     */
    public char[] getFila(int numFila){
        char[] fila = new char[NUM_FILAS];
        
        for(int columna = 0; columna <NUM_FILAS; columna++){
            fila[columna] = colores[numFila][columna];
        }
        
        return fila;
    }
    
    /**
     * Returna una determinada columna de la matriz cara como un vector
     * @param numColumna el numero de columna que se desea obtener 
     * @return vector que representa una columna
     */
    public char[] getColumna(int numColumna){
        char columna[] = new char[NUM_FILAS];
        
        for(int fila = 0; fila <NUM_FILAS; fila++){
            columna[fila] = colores[fila][numColumna];
        }
        
        return columna;
    }   
    
    /**
     * Obtiene una determinada fila en forma de una cadena. Este metodo solo para imprimir por consola
     * @param numFila el numero de fila que se desea obtener
     * @return 
     */
    public String getCadenaFila(int numFila){
        String cadena = "";
        for(int columna = 0; columna<NUM_FILAS; columna++)
            cadena += String.valueOf(colores[numFila][columna])+" ";
        
        return cadena;
    }
    
    /**
     * obtiene la matriz de colores que representa la cara
     * @return char[][] matriz que representa la cara
     */
    public char[][] getColores(){
        return colores;
    }
    
}
