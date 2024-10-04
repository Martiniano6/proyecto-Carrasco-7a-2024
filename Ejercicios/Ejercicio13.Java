import java.util.Scanner;

public class DiasDelMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String mes = sc.nextLine().toLowerCase(); 

    
        int dias;
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                dias = 30; // Meses con 30 días
                break;
            case "febrero":
                dias = 28; 
                break;
            default:
                System.out.println("Mes inválido, ingrese un mes válido.");
                return; 
        }

        System.out.println("El mes de " + mes + " tiene " + dias + " días ");
    }
}
