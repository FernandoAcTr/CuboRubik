package modelo;

public class Test {
    public static void main(String[] args) {
        Cubo5x5 cubo = new Cubo5x5();

        System.out.println("Cubo inicial------------------------------");
        cubo.mostrarCubo();

        System.out.println("Girar cara superior horario------------------------------");
        cubo.girarFila_D(0);
        cubo.mostrarCubo();

        /*System.out.println("Girar cara izquiera arriba------------------------------");
        cubo.girarColumna_Arriba(0);
        cubo.mostrarCubo();*/

    }
}
