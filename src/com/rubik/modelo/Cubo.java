package com.rubik.modelo;

public class Cubo {

    public Central piezaCentral[];
    public Lateral piezaLateral[];
    public Esquina piezaEsquina[];

    public final static char UP = 'U';
    public final static char DOWN = 'D';
    public final static char LEFT = 'L';
    public final static char RIGTH = 'R';
    public final static char BACK = 'B';
    public final static char FRONT = 'F';

    public static final char COLOR_YELLOW = 'Y';
    public static final char COLOR_BLUE = 'B';
    public static final char COLOR_GREEN = 'G';
    public static final char COLOR_WHITE = 'W';
    public static final char COLOR_ORANGE = 'O';
    public static final char COLOR_RED = 'R';

    public Cubo() {
        piezaCentral = new Central[Central.NUM_PZAS_CENTRALES];
        for (int i = 0; i < piezaCentral.length; i++)
            piezaCentral[i] = new Central();

        piezaLateral = new Lateral[Lateral.NUM_PZAS_LATERAL];
        for (int i = 0; i < piezaLateral.length; i++)
            piezaLateral[i] = new Lateral();

        piezaEsquina = new Esquina[Esquina.NUM_PZAS_ESQUINAS];
        for (int i = 0; i < piezaEsquina.length; i++)
            piezaEsquina[i] = new Esquina();

        iniciaPiezas();
    }

    /**
     * Debido a que una pieza central solo tiene una orientacion, esta puede funcionar como identificador.
     * Con base en una orientacion puedo obtener una pieza central específica y regresar su color.
     * El metodo recorre el array orientacion de cada pieza central para buscar la que se pasa por parametro.
     *
     * @param orientation la orientacion de la pieza que quiero encontrar su color
     * @return El color de la pieza central que busco
     */
    public char getColorCentral(char orientation) {
        boolean esta = false;
        char color = 'T';
        int i = 0, j = 0;

        while (i < piezaCentral.length && !esta) {

            j = 0;

            while (j < piezaCentral[i].tupla.orientacion.length && !esta) {

                if (piezaCentral[i].tupla.orientacion[j] == orientation) {
                    esta = true;
                    color = piezaCentral[i].tupla.color[j];
                } else
                    j++;
            }

            i++;
        }

        return color;
    }

    /**
     * Recupera uno de los colores de una pieza lateral especifica. Identificandola mediante sus dos orientaciones.
     *
     * @param orientation1 orientacion 1 de la pieza lateral
     * @param orientation2 orientacion 2 de la pieza lateral
     * @param orientColor  orientacion cuyo color quiero recuperar
     * @return color de la pieza lateral en una de sus dos orientaciones
     */
    public char getColorLateral(char orientation1, char orientation2, char orientColor) {
        boolean esta = false;
        boolean posicion1 = false;
        boolean posicion2 = false;
        int i = 0, j = 0, k = 0;
        char color = 'T';

        while (i < piezaLateral.length && !esta) {

            j = 0;
            while (j < piezaLateral[i].tupla.orientacion.length && !posicion1) {

                if (piezaLateral[i].tupla.orientacion[j] == orientation1)
                    posicion1 = true;
                else
                    j++;

            }

            k = 0;
            while (k < piezaLateral[i].tupla.orientacion.length && !posicion2) {

                if (piezaLateral[i].tupla.orientacion[k] == orientation2)
                    posicion2 = true;
                else
                    k++;
            }

            if (posicion1 && posicion2) {
                if (orientation1 == orientColor)
                    color = piezaLateral[i].tupla.color[j];
                else
                    color = piezaLateral[i].tupla.color[k];

                esta = true;
            } else {
                posicion1 = false;
                posicion2 = false;
                i++;
            }
        }

        return color;
    }

    /**
     * Recupera uno de los colores de una pieza esquina especifica. Identificandola mediante sus tres orientaciones.
     *
     * @param orientation1 la orientacion 1 de la pieza en cuestion
     * @param orientation2 la orientacion 2 de la pueza en cuestion
     * @param orientation3 la orientacion 3 de la pieza en cuestion
     * @param orientColor  la orientacion cuyo color quiero recuperar
     * @return
     */
    public char getColorEsquina(char orientation1, char orientation2, char orientation3, char orientColor) {
        boolean esta = false;
        boolean posicion1 = false;
        boolean posicion2 = false;
        boolean posicion3 = false;
        char color = 'T';
        int i = 0, j = 0, k = 0, l = 0;

        while (i < piezaEsquina.length && !esta) {

            j = 0;
            while (j < piezaEsquina[i].tupla.orientacion.length && !posicion1) {

                if (piezaEsquina[i].tupla.orientacion[j] == orientation1)
                    posicion1 = true;
                else
                    j++;
            }

            k = 0;
            while (k < piezaEsquina[i].tupla.orientacion.length && !posicion2) {

                if (piezaEsquina[i].tupla.orientacion[k] == orientation2)
                    posicion2 = true;
                else
                    k++;
            }

            l = 0;
            while (l < piezaEsquina[i].tupla.orientacion.length && !posicion3) {

                if (piezaEsquina[i].tupla.orientacion[l] == orientation3)
                    posicion3 = true;
                else
                    l++;
            }

            if (posicion1 && posicion2 && posicion3) {

                if (orientation1 == orientColor)
                    color = piezaEsquina[i].tupla.color[j];
                else if (orientation2 == orientColor)
                    color = piezaEsquina[i].tupla.color[k];
                else
                    color = piezaEsquina[i].tupla.color[l];

                esta = true;
            } else {
                esta = false;
                posicion1 = false;
                posicion2 = false;
                posicion3 = false;
                i++;
            }
        }

        return color;
    }

    public void imprimePiezas() {
        System.out.println("    " + getColorEsquina('U', 'L', 'B', 'U') + getColorLateral('U', 'B', 'U') + getColorEsquina('U', 'R', 'B', 'U'));
        System.out.println("    " + getColorLateral('U', 'L', 'U') + getColorCentral('U') + getColorLateral('U', 'R', 'U'));
        System.out.println("    " + getColorEsquina('U', 'F', 'L', 'U') + getColorLateral('U', 'F', 'U') + getColorEsquina('U', 'F', 'R', 'U'));

        System.out.print("" + getColorEsquina('L', 'U', 'B', 'L') + getColorLateral('L', 'U', 'L') + getColorEsquina('L', 'U', 'F', 'L') + " ");
        System.out.print("" + getColorEsquina('F', 'U', 'L', 'F') + getColorLateral('F', 'U', 'F') + getColorEsquina('F', 'U', 'R', 'F') + " ");
        System.out.print("" + getColorEsquina('F', 'U', 'R', 'R') + getColorLateral('R', 'U', 'R') + getColorEsquina('R', 'U', 'B', 'R') + " ");

        System.out.println("" + getColorEsquina('B', 'U', 'R', 'B') + getColorLateral('B', 'U', 'B') + getColorEsquina('B', 'U', 'L', 'B') + " ");
        System.out.print("" + getColorLateral('L', 'B', 'L') + getColorCentral('L') + getColorLateral('L', 'F', 'L') + " ");
        System.out.print("" + getColorLateral('L', 'F', 'F') + getColorCentral('F') + getColorLateral('F', 'R', 'F') + " ");

        System.out.print("" + getColorLateral('F', 'R', 'R') + getColorCentral('R') + getColorLateral('R', 'B', 'R') + " ");
        System.out.println("" + getColorLateral('R', 'B', 'B') + getColorCentral('B') + getColorLateral('L', 'B', 'B') + " ");
        System.out.print("" + getColorEsquina('L', 'D', 'B', 'L') + getColorLateral('L', 'D', 'L') + getColorEsquina('L', 'D', 'F', 'L') + " ");

        System.out.print("" + getColorEsquina('F', 'D', 'L', 'F') + getColorLateral('F', 'D', 'F') + getColorEsquina('F', 'D', 'R', 'F') + " ");
        System.out.print("" + getColorEsquina('F', 'D', 'R', 'R') + getColorLateral('R', 'D', 'R') + getColorEsquina('R', 'D', 'B', 'R') + " ");
        System.out.println("" + getColorEsquina('B', 'D', 'R', 'B') + getColorLateral('B', 'D', 'B') + getColorEsquina('B', 'D', 'L', 'B') + " ");

        System.out.println("    " + getColorEsquina('D', 'L', 'F', 'D') + getColorLateral('D', 'F', 'D') + getColorEsquina('D', 'F', 'R', 'D'));
        System.out.println("    " + getColorLateral('D', 'L', 'D') + getColorCentral('D') + getColorLateral('D', 'R', 'D'));
        System.out.println("    " + getColorEsquina('D', 'L', 'B', 'D') + getColorLateral('D', 'B', 'D') + getColorEsquina('D', 'R', 'B', 'D'));

        System.out.println("");
    }

    //<editor-fold desc="Metodo que inicializa las piezas">
    public void iniciaPiezas() {
        piezaCentral[0].tupla.color[0] = 'B';
        piezaCentral[0].tupla.orientacion[0] = 'R';
        piezaCentral[1].tupla.color[0] = 'Y';
        piezaCentral[1].tupla.orientacion[0] = 'F';
        piezaCentral[2].tupla.color[0] = 'R';
        piezaCentral[2].tupla.orientacion[0] = 'U';
        piezaCentral[3].tupla.color[0] = 'G';
        piezaCentral[3].tupla.orientacion[0] = 'L';
        piezaCentral[4].tupla.color[0] = 'O';
        piezaCentral[4].tupla.orientacion[0] = 'D';
        piezaCentral[5].tupla.color[0] = 'W';
        piezaCentral[5].tupla.orientacion[0] = 'B';

        piezaLateral[0].tupla.color[0] = 'R';
        piezaLateral[0].tupla.orientacion[0] = 'U';
        piezaLateral[0].tupla.color[1] = 'Y';
        piezaLateral[0].tupla.orientacion[1] = 'F';
        piezaLateral[1].tupla.color[0] = 'B';
        piezaLateral[1].tupla.orientacion[0] = 'R';
        piezaLateral[1].tupla.color[1] = 'Y';
        piezaLateral[1].tupla.orientacion[1] = 'F';
        piezaLateral[2].tupla.color[0] = 'O';
        piezaLateral[2].tupla.orientacion[0] = 'D';
        piezaLateral[2].tupla.color[1] = 'Y';
        piezaLateral[2].tupla.orientacion[1] = 'F';
        piezaLateral[3].tupla.color[0] = 'G';
        piezaLateral[3].tupla.orientacion[0] = 'L';
        piezaLateral[3].tupla.color[1] = 'Y';
        piezaLateral[3].tupla.orientacion[1] = 'F';
        piezaLateral[4].tupla.color[0] = 'R';
        piezaLateral[4].tupla.orientacion[0] = 'U';
        piezaLateral[4].tupla.color[1] = 'B';
        piezaLateral[4].tupla.orientacion[1] = 'R';
        piezaLateral[5].tupla.color[0] = 'R';
        piezaLateral[5].tupla.orientacion[0] = 'U';
        piezaLateral[5].tupla.color[1] = 'G';
        piezaLateral[5].tupla.orientacion[1] = 'L';
        piezaLateral[6].tupla.color[0] = 'O';
        piezaLateral[6].tupla.orientacion[0] = 'D';
        piezaLateral[6].tupla.color[1] = 'B';
        piezaLateral[6].tupla.orientacion[1] = 'R';
        piezaLateral[7].tupla.color[0] = 'O';
        piezaLateral[7].tupla.orientacion[0] = 'D';
        piezaLateral[7].tupla.color[1] = 'G';
        piezaLateral[7].tupla.orientacion[1] = 'L';
        piezaLateral[8].tupla.color[0] = 'R';
        piezaLateral[8].tupla.orientacion[0] = 'U';
        piezaLateral[8].tupla.color[1] = 'W';
        piezaLateral[8].tupla.orientacion[1] = 'B';
        piezaLateral[9].tupla.color[0] = 'G';
        piezaLateral[9].tupla.orientacion[0] = 'L';
        piezaLateral[9].tupla.color[1] = 'W';
        piezaLateral[9].tupla.orientacion[1] = 'B';
        piezaLateral[10].tupla.color[0] = 'B';
        piezaLateral[10].tupla.orientacion[0] = 'R';
        piezaLateral[10].tupla.color[1] = 'W';
        piezaLateral[10].tupla.orientacion[1] = 'B';
        piezaLateral[11].tupla.color[0] = 'O';
        piezaLateral[11].tupla.orientacion[0] = 'D';
        piezaLateral[11].tupla.color[1] = 'W';
        piezaLateral[11].tupla.orientacion[1] = 'B';

        piezaEsquina[0].tupla.color[0] = 'R';
        piezaEsquina[0].tupla.orientacion[0] = 'U';
        piezaEsquina[0].tupla.color[1] = 'Y';
        piezaEsquina[0].tupla.orientacion[1] = 'F';
        piezaEsquina[0].tupla.color[2] = 'B';
        piezaEsquina[0].tupla.orientacion[2] = 'R';
        piezaEsquina[1].tupla.color[0] = 'R';
        piezaEsquina[1].tupla.orientacion[0] = 'U';
        piezaEsquina[1].tupla.color[1] = 'Y';
        piezaEsquina[1].tupla.orientacion[1] = 'F';
        piezaEsquina[1].tupla.color[2] = 'G';
        piezaEsquina[1].tupla.orientacion[2] = 'L';
        piezaEsquina[2].tupla.color[0] = 'O';
        piezaEsquina[2].tupla.orientacion[0] = 'D';
        piezaEsquina[2].tupla.color[1] = 'Y';
        piezaEsquina[2].tupla.orientacion[1] = 'F';
        piezaEsquina[2].tupla.color[2] = 'B';
        piezaEsquina[2].tupla.orientacion[2] = 'R';
        piezaEsquina[3].tupla.color[0] = 'O';
        piezaEsquina[3].tupla.orientacion[0] = 'D';
        piezaEsquina[3].tupla.color[1] = 'Y';
        piezaEsquina[3].tupla.orientacion[1] = 'F';
        piezaEsquina[3].tupla.color[2] = 'G';
        piezaEsquina[3].tupla.orientacion[2] = 'L';
        piezaEsquina[4].tupla.color[0] = 'R';
        piezaEsquina[4].tupla.orientacion[0] = 'U';
        piezaEsquina[4].tupla.color[1] = 'B';
        piezaEsquina[4].tupla.orientacion[1] = 'R';
        piezaEsquina[4].tupla.color[2] = 'W';
        piezaEsquina[4].tupla.orientacion[2] = 'B';
        piezaEsquina[5].tupla.color[0] = 'R';
        piezaEsquina[5].tupla.orientacion[0] = 'U';
        piezaEsquina[5].tupla.color[1] = 'G';
        piezaEsquina[5].tupla.orientacion[1] = 'L';
        piezaEsquina[5].tupla.color[2] = 'W';
        piezaEsquina[5].tupla.orientacion[2] = 'B';
        piezaEsquina[6].tupla.color[0] = 'O';
        piezaEsquina[6].tupla.orientacion[0] = 'D';
        piezaEsquina[6].tupla.color[1] = 'B';
        piezaEsquina[6].tupla.orientacion[1] = 'R';
        piezaEsquina[6].tupla.color[2] = 'W';
        piezaEsquina[6].tupla.orientacion[2] = 'B';
        piezaEsquina[7].tupla.color[0] = 'O';
        piezaEsquina[7].tupla.orientacion[0] = 'D';
        piezaEsquina[7].tupla.color[1] = 'G';
        piezaEsquina[7].tupla.orientacion[1] = 'L';
        piezaEsquina[7].tupla.color[2] = 'W';
        piezaEsquina[7].tupla.orientacion[2] = 'B';
    }
    //</editor-fold>

    /**
     * Mueve la cara superior o inferior de manera horizontalmente, ya sea en sentido horario o antihorario.
     * El algoritmo funciona mediante 3 barridos, el primero analiza todas las piezas laterales, para cada pieza lateral
     * se barren todas sus orientaciones (2 orientaciones) (segundo barrido)
     * si una de esas dos orientaciones es igual a la cara como paramentro
     * significa que esa pieza se debe modificar. Ya identificada la pieza, se hace un tercer barrido de sus orientaciones
     * para identificar la orientacion que debe de modificarse (la que es diferente a la cara)
     * pues si se pretende mover la cara superior (Up), no tiene sentido
     * modicar las orientaciones Up de las piezas. SE hace lo mismo con las piezas esquina
     *
     * @param cara  La cara superior o inferior que se desea mover. U o D
     * @param signo 0 para sentido horario, 1 para sentido antihorario
     */
    public void movHorizontal(char cara, int signo) {
        char secuenciaGiro[] = {'F', 'L', 'B', 'R'};

        for (int i = 0; i < piezaLateral.length; i++)
            for (int j = 0; j < piezaLateral[i].tupla.orientacion.length; j++)
                if (piezaLateral[i].tupla.orientacion[j] == cara)
                    for (int k = 0; k < piezaLateral[i].tupla.orientacion.length; k++)
                        if (piezaLateral[i].tupla.orientacion[k] != cara) {

                            char caraActual = piezaLateral[i].tupla.orientacion[k];
                            int caraNueva = 0; //representa el indice de la secuencia de Giro
                            while (caraActual != secuenciaGiro[caraNueva])
                                caraNueva++;

                            if (signo == 0)
                                caraNueva++;
                            else
                                caraNueva--;

                            if (caraNueva < 0)
                                caraNueva = 3;
                            else if (caraNueva > 3)
                                caraNueva = 0;

                            piezaLateral[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                        }


        for (int i = 0; i < piezaEsquina.length; i++)
            for (int j = 0; j < piezaEsquina[i].tupla.orientacion.length; j++)
                if (piezaEsquina[i].tupla.orientacion[j] == cara)
                    for (int k = 0; k < piezaEsquina[i].tupla.orientacion.length; k++)
                        if (piezaEsquina[i].tupla.orientacion[k] != cara) {

                            char caraActual = piezaEsquina[i].tupla.orientacion[k];
                            int caraNueva = 0; //representa el indice de la secuencia de Giro
                            while (caraActual != secuenciaGiro[caraNueva])
                                caraNueva++;

                            if (signo == 0)
                                caraNueva++;
                            else
                                caraNueva--;

                            if (caraNueva < 0)
                                caraNueva = 3;
                            else if (caraNueva > 3)
                                caraNueva = 0;

                            piezaEsquina[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                        }
    }

    /**
     * Mueve la cara derecha o inzquierda de manera horizontalmente, ya sea en sentido horario o antihorario.
     * El algoritmo funciona mediante 3 barridos, el primero analiza todas las piezas laterales, para cada pieza lateral
     * se barren todas sus orientaciones (2 orientaciones) (segundo barrido)
     * si una de esas dos orientaciones es igual a la cara como paramentro
     * significa que esa pieza se debe modificar. Ya identificada la pieza, se hace un tercer barrido de sus orientaciones
     * para identificar la orientacion que debe de modificarse (la que es diferente a la cara)
     * pues si se pretende mover la cara izquierda (Left), no tiene sentido
     * modicar las orientaciones L de las piezas. Se hace lo mismo con las piezas esquina
     *
     * @param cara  La cara (derecha o izquierda) que se desea mover. L o R
     * @param signo 0 para sentido horario, 1 para sentido antihorario
     */
    public void movVertical(char cara, int signo) {
        char secuenciaGiro[] = {'F', 'D', 'B', 'U'};

        for (int i = 0; i < piezaLateral.length; i++)
            for (int j = 0; j < piezaLateral[i].tupla.orientacion.length; j++)
                if (piezaLateral[i].tupla.orientacion[j] == cara)
                    for (int k = 0; k < piezaLateral[i].tupla.orientacion.length; k++)
                        if (piezaLateral[i].tupla.orientacion[k] != cara) {

                            char caraActual = piezaLateral[i].tupla.orientacion[k];
                            int caraNueva = 0; //representa el indice de la secuencia de Giro
                            while (caraActual != secuenciaGiro[caraNueva])
                                caraNueva++;

                            if (signo == 0)
                                caraNueva++;
                            else
                                caraNueva--;

                            if (caraNueva < 0)
                                caraNueva = 3;
                            else if (caraNueva > 3)
                                caraNueva = 0;

                            piezaLateral[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                        }

        for (int i = 0; i < piezaEsquina.length; i++)
            for (int j = 0; j < piezaEsquina[i].tupla.orientacion.length; j++)
                if (piezaEsquina[i].tupla.orientacion[j] == cara)
                    for (int k = 0; k < piezaEsquina[i].tupla.orientacion.length; k++)
                        if (piezaEsquina[i].tupla.orientacion[k] != cara) {

                            char caraActual = piezaEsquina[i].tupla.orientacion[k];
                            int caraNueva = 0; //representa el indice de la secuencia de Giro
                            while (caraActual != secuenciaGiro[caraNueva])
                                caraNueva++;

                            if (signo == 0)
                                caraNueva++;
                            else
                                caraNueva--;

                            if (caraNueva < 0)
                                caraNueva = 3;
                            else if (caraNueva > 3)
                                caraNueva = 0;

                            piezaEsquina[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                        }
    }

    /**
     * Mueve la cara frontal o trasera de manera horizontalmente, ya sea en sentido horario o antihorario.
     * El algoritmo funciona mediante 3 barridos, el primero analiza todas las piezas laterales, para cada pieza lateral
     * se barren todas sus orientaciones (2 orientaciones) (segundo barrido)
     * si una de esas dos orientaciones es igual a la cara como paramentro
     * significa que esa pieza se debe modificar. Ya identificada la pieza, se hace un tercer barrido de sus orientaciones
     * para identificar la orientacion que debe de modificarse (la que es diferente a la cara)
     * pues si se pretende mover la cara frontal (Front), no tiene sentido
     * modicar las orientaciones F de las piezas. Se hace lo mismo con las piezas esquina
     *
     * @param cara  La cara (front o back) que se desea mover. F o B
     * @param signo 0 para sentido horario, 1 para sentido antihorario
     */
    public void movFrontal(char cara, int signo) {
        char secuenciaGiro[] = {'U', 'R', 'D', 'L'};

        for (int i = 0; i < piezaLateral.length; i++)
            for (int j = 0; j < piezaLateral[i].tupla.orientacion.length; j++)
                if (piezaLateral[i].tupla.orientacion[j] == cara)
                    for (int k = 0; k < piezaLateral[i].tupla.orientacion.length; k++)
                        if (piezaLateral[i].tupla.orientacion[k] != cara) {

                            char caraActual = piezaLateral[i].tupla.orientacion[k];
                            int caraNueva = 0; //representa el indice de la secuencia de Giro
                            while (caraActual != secuenciaGiro[caraNueva])
                                caraNueva++;

                            if (signo == 0)
                                caraNueva++;
                            else
                                caraNueva--;

                            if (caraNueva < 0)
                                caraNueva = 3;
                            else if (caraNueva > 3)
                                caraNueva = 0;

                            piezaLateral[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                        }

        for (int i = 0; i < piezaEsquina.length; i++)
            for (int j = 0; j < piezaEsquina[i].tupla.orientacion.length; j++)
                if (piezaEsquina[i].tupla.orientacion[j] == cara)
                    for (int k = 0; k < piezaEsquina[i].tupla.orientacion.length; k++)
                        if (piezaEsquina[i].tupla.orientacion[k] != cara) {

                            char caraActual = piezaEsquina[i].tupla.orientacion[k];
                            int caraNueva = 0; //representa el indice de la secuencia de Giro
                            while (caraActual != secuenciaGiro[caraNueva])
                                caraNueva++;

                            if (signo == 0)
                                caraNueva++;
                            else
                                caraNueva--;

                            if (caraNueva < 0)
                                caraNueva = 3;
                            else if (caraNueva > 3)
                                caraNueva = 0;

                            piezaEsquina[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                        }
    }


    /**
     * Mueve la cruz central de manera vertical, en sentido horario o antihorario
     * @param signo 0 para sentido horario, 1 para sentido antihorario
     */
    public void movCruzVertical(int signo) {
        boolean modificar = true;
        char secuenciaGiro[] = {'F', 'D', 'B', 'U'};

        for (int i = 0; i < piezaCentral.length; i++)
            if (piezaCentral[i].tupla.orientacion[0] != LEFT && piezaCentral[i].tupla.orientacion[0] != RIGTH) {
                char caraActual = piezaCentral[i].tupla.orientacion[0];
                int caraNueva = 0;
                while (caraActual != secuenciaGiro[caraNueva])
                    caraNueva++;

                if (signo == 0)
                    caraNueva++;
                else
                    caraNueva--;

                if (caraNueva < 0)
                    caraNueva = 3;
                else if (caraNueva > 3)
                    caraNueva = 0;

                piezaCentral[i].tupla.orientacion[0] = secuenciaGiro[caraNueva];
            }

        for (int i = 0; i < piezaLateral.length; i++) {
            modificar = true;

            for (int j = 0; j < piezaLateral[i].tupla.orientacion.length; j++) {
                if (piezaLateral[i].tupla.orientacion[j] == LEFT || piezaLateral[i].tupla.orientacion[j] == RIGTH)
                    modificar = false;
            }


            if (modificar) {
                for (int k = 0; k < piezaLateral[i].tupla.orientacion.length; k++) {

                    char caraActual = piezaLateral[i].tupla.orientacion[k];
                    int caraNueva = 0;
                    while (caraActual != secuenciaGiro[caraNueva])
                        caraNueva++;

                    if (signo == 0)
                        caraNueva++;
                    else
                        caraNueva--;

                    if (caraNueva < 0)
                        caraNueva = 3;
                    else if (caraNueva > 3)
                        caraNueva = 0;

                    piezaLateral[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                }
            }
        }

    }

    /**
     * Mueve la cruz central de manera horizontal, en sentido horario o antihorario
     * @param signo 0 para sentido horario, 1 para sentido antihorario
     */
    public void movCruzHorizontal(int signo){
        boolean modificar = true;
        char secuenciaGiro[] = {'F', 'L', 'B', 'R'};

        for (int i = 0; i < piezaCentral.length; i++)
            if (piezaCentral[i].tupla.orientacion[0] != UP && piezaCentral[i].tupla.orientacion[0] != DOWN) {
                char caraActual = piezaCentral[i].tupla.orientacion[0];
                int caraNueva = 0;
                while (caraActual != secuenciaGiro[caraNueva])
                    caraNueva++;

                if (signo == 0)
                    caraNueva++;
                else
                    caraNueva--;

                if (caraNueva < 0)
                    caraNueva = 3;
                else if (caraNueva > 3)
                    caraNueva = 0;

                piezaCentral[i].tupla.orientacion[0] = secuenciaGiro[caraNueva];
            }

        for (int i = 0; i < piezaLateral.length; i++) {
            modificar = true;

            for (int j = 0; j < piezaLateral[i].tupla.orientacion.length; j++) {
                if (piezaLateral[i].tupla.orientacion[j] == UP || piezaLateral[i].tupla.orientacion[j] == DOWN)
                    modificar = false;
            }


            if (modificar) {
                for (int k = 0; k < piezaLateral[i].tupla.orientacion.length; k++) {

                    char caraActual = piezaLateral[i].tupla.orientacion[k];
                    int caraNueva = 0;
                    while (caraActual != secuenciaGiro[caraNueva])
                        caraNueva++;

                    if (signo == 0)
                        caraNueva++;
                    else
                        caraNueva--;

                    if (caraNueva < 0)
                        caraNueva = 3;
                    else if (caraNueva > 3)
                        caraNueva = 0;

                    piezaLateral[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                }
            }
        }
    }

    /**
     * Mueve la cruz del eje frontal, en sentido horario o antihorario
     * @param signo 0 para sentido horario, 1 para sentido antihorario
     */
    public void movCruzFrontal(int signo){
        boolean modificar = true;
        char secuenciaGiro[] = {'U', 'R', 'D', 'L'};

        for (int i = 0; i < piezaCentral.length; i++)
            if (piezaCentral[i].tupla.orientacion[0] != FRONT && piezaCentral[i].tupla.orientacion[0] != BACK) {
                char caraActual = piezaCentral[i].tupla.orientacion[0];
                int caraNueva = 0;
                while (caraActual != secuenciaGiro[caraNueva])
                    caraNueva++;

                if (signo == 0)
                    caraNueva++;
                else
                    caraNueva--;

                if (caraNueva < 0)
                    caraNueva = 3;
                else if (caraNueva > 3)
                    caraNueva = 0;

                piezaCentral[i].tupla.orientacion[0] = secuenciaGiro[caraNueva];
            }

        for (int i = 0; i < piezaLateral.length; i++) {
            modificar = true;

            for (int j = 0; j < piezaLateral[i].tupla.orientacion.length; j++) {
                if (piezaLateral[i].tupla.orientacion[j] == FRONT || piezaLateral[i].tupla.orientacion[j] == BACK)
                    modificar = false;
            }


            if (modificar) {
                for (int k = 0; k < piezaLateral[i].tupla.orientacion.length; k++) {

                    char caraActual = piezaLateral[i].tupla.orientacion[k];
                    int caraNueva = 0;
                    while (caraActual != secuenciaGiro[caraNueva])
                        caraNueva++;

                    if (signo == 0)
                        caraNueva++;
                    else
                        caraNueva--;

                    if (caraNueva < 0)
                        caraNueva = 3;
                    else if (caraNueva > 3)
                        caraNueva = 0;

                    piezaLateral[i].tupla.orientacion[k] = secuenciaGiro[caraNueva];
                }
            }
        }
    }
}


