import java.util.Scanner;

public class Vocal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0);

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            System.out.println(caracter + " es una vocal.");
        } else {
            System.out.println(caracter + " no es una vocal.");
        }
    }
}
