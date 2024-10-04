import java.util.Scanner;

public class DocenaDeNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primera docena (1-12).");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena (13-24).");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número " + numero + " pertenece a la tercera docena (25-36).");

        } else if (numero < 1 || numero > 36) {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
