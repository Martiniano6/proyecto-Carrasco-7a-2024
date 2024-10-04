public class ejer18 {

    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) { // Primer ciclo: del 1 al 10
            System.out.println("Tabla de multiplicar de " + n + ":");

            for (int j = 1; j <= 10; j++) { 
                int resultado = n * j;
                System.out.println(n + " x " + j + " = " + resultado);
            }
            System.out.println(); // Línea en blanco entre tablas
        }
    }
}
