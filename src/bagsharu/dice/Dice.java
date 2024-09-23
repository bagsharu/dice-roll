package bagsharu.dice;

import java.util.Random;

public class Dice {

    // Todo dado possui os seguintes atributos:
    private int numLados;
    Random roll = new Random();

    // Método de rolagem de dado

    public void diceRoll(int rollValue) {

        // Imprime o "nome" do dado concatenado com seu número de lados e a rolagem em sequência.
        for (int i = 1; i <= rollValue ; i++) {
            System.out.printf("d%d = %d\n", numLados, (roll.nextInt(numLados) + 1));
        }
    }

    // Método Getter e Setter
    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }


}
