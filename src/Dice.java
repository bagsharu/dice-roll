import java.util.Random;

public class Dice {

    // Todo dado possui os seguintes atributos:
    int numLados;
    Random roll = new Random();

    // Método de rolagem de dado

    void diceRoll(int rollValue) {

        // Imprime o "nome" do dado concatenado com seu número de lados e a rolagem em sequência.
        for (int i = 1; i <= rollValue ; i++) {
            System.out.println("d" + numLados + " = " + (roll.nextInt(numLados + 1)));
        }
    }


}
