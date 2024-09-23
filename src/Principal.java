import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Instanciando objetos
        Scanner scanner = new Scanner(System.in);
        Dice dadinho = new Dice();

        dadinho.numLados = scanner.nextInt();

        dadinho.diceRoll();

    }
}