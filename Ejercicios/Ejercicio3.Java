import java.util.Scanner;

public class CantidadDiasDelMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del mes: ");
        String mes = sc.nextLine().toLowerCase(); 

        String resultado;
        switch (mes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                resultado = "31 días";
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                resultado = "30 días";
                break;
            case "febrero":
                resultado = "28 días (o 29 en año bisiesto)";
                break;
            default:
                resultado = "Mes no válido";
        }

       
        System.out.println("El mes de " + mes + " tiene " + resultado + "dias");
    }
}
