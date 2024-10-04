import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {
        Random random = new Random(); 
        int cantidad = 10; 
        int suma = 0; 
        int contador = 0; 

        System.out.println("Números aleatorios generados:");

        while (contador < cantidad) {
            int numeroAleatorio = random.nextInt(100); // Genera numero 0 a 99
            System.out.println(numeroAleatorio);
            suma += numeroAleatorio;
            contador++; // Incrementar el contador
        }

        double promedio = (double) suma / cantidad;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
