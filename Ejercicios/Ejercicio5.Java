import java.util.Scanner;

public class Torneo {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Ingrese el puesto en el torneo: ");
        int puesto = sc.nextInt();

        String mensaje;
        switch (puesto) {
            case 1:
                mensaje = "El primero obtiene la medalla de oro.";
                break;
            case 2:
                mensaje = "El segundo obtiene la medalla de plata.";
                break;
            case 3:
                mensaje = "El tercero obtiene la medalla de bronce.";
                break;
            default:
                mensaje = "Siga participando.";
        }

        // Mostrar el resultado
        System.out.println(mensaje);
    }
}
