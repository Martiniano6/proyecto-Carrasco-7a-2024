import java.util.Scanner;

public class CategoriaFamilia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Ingrese una categoría (a, b o c): ");
        char categoria = sc.next().toLowerCase().charAt(0); 

        String palabra;
        switch (categoria) {
            case 'a':
                palabra = "hijo";
                break;
            case 'b':
                palabra = "padres";
                break;
            case 'c':
                palabra = "abuelos";
                break;
            default:
                palabra = "Categoría no válida";
        }

        
        System.out.println("La categoría " + categoria + " corresponde a: " + palabra);
    }
}
