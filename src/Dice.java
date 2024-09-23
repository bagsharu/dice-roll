import java.util.Random;

public class Dice {

    // Todo dado possui os seguintes atributos:
    int numLados;
    Random roll = new Random();

    // Método de rolagem de dado

    void diceRoll() {

        // Imprime o "nome" do dado concatenado com seu número de lados e a rolagem em sequência.
        System.out.println("d" + numLados + " = " + roll.nextInt(numLados) +1);
    }


}
