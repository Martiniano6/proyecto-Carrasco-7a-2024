import java.util.Scanner;

public class SumaParesConIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número para sumar los valores pares: ");
        int numero = sc.nextInt();

        int sumaPares = 0;

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) 
                sumaPares += i;
            }
        }


        System.out.println("La suma de los valores pares" + numero + " es: " + sumaPares);

    }
}
