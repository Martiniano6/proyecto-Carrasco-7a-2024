import java.util.Scanner;

public class Torneo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el puesto al usuario
        System.out.print("Ingrese el puesto obtenido en el torneo (1-2-3): ");
        int puesto = sc.nextInt();

        switch (puesto) {
            case 1:
                System.out.println("El primero obtiene la medalla de oro.");
                break;
            case 2:
                System.out.println("El segundo obtiene la medalla de plata.");
                break;
            case 3:
                System.out.println("El tercero obtiene la medalla de bronce.");
                break;
            default:
                System.out.println("Siga participando.");
                break;
        }
    }
}
