import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Instanciando objetos
        Scanner scanner = new Scanner(System.in);
        Dice dadinho = new Dice();

        System.out.println("Insira quantos lados tem o dado:");
        dadinho.setNumLados(scanner.nextInt());

        System.out.println("Agora, quantas rolagens você deseja:");
        int numRolagens = scanner.nextInt();

        dadinho.diceRoll(numRolagens);

    }
}