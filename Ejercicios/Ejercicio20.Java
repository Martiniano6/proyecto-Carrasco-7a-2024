import java.util.Random;

public class MaximoMinimoAlazar {

    public static void main(String[] args) {
        Random random = new Random(); 
        int cantidad = 10; 
        int contador = 0; 
        int numeroAleatorio;

        
        int maximo = Integer.MIN_VALUE; 
        int minimo = Integer.MAX_VALUE; 

        System.out.println("Números aleatorios generados(10):");

        do {
            numeroAleatorio = random.nextInt(100); 
            System.out.println(numeroAleatorio); 

            if (numeroAleatorio > maximo) {
                maximo = numeroAleatorio; 
            }
            if (numeroAleatorio < minimo) {
                minimo = numeroAleatorio; 
            }

            contador++; 
        } while (contador < cantidad); 

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
