import java.util.Scanner;

public class PiedraPapelTijeraConAnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Player 1, ingrese 0 para piedra, 1 para papel, 2 para tijera: ");
        int Player1 = sc.nextInt();

        System.out.print("Player 2, ingrese 0 para piedra, 1 para papel, 2 para tijera: ");
        int Player2 = sc.nextInt();


        if (Player1 == Player2) {
            System.out.println("Empate!");
        } else if (Player1 == 0 && Player2 == 2) { 
            System.out.println("Player 1 gana!");
        } else if (Player1 == 1 && Player2 == 0) { 
            System.out.println("Player 1 gana!");
        } else if (Player1 == 2 && Player2 == 1) { 
            System.out.println("Player 1 gana!");
        } else {
            System.out.println("Player 2 gana!");
        }
    }
}
