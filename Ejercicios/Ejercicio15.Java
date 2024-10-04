import java.util.Scanner;

public class CaracteristicasAuto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la clase del auto (a, b, c): ");
        char clase = sc.next().toLowerCase().charAt(0);


        switch (clase) {
            case 'a':
                System.out.println("Clase A: El auto tiene 4 ruedas y un motor.");
                break;
            case 'b':
                System.out.println("Clase B: El auto tiene 4 ruedas, un motor, cierre centralizado y aire acondicionado.");
                break;
            case 'c':
                System.out.println("Clase C: El auto tiene 4 ruedas, un motor, cierre centralizado, aire acondicionado y airbag.");
                break;
            default:
                System.out.println("Clase inválida. Por favor, ingrese 'a', 'b' o 'c'.");
                break;
        }
    }
}
