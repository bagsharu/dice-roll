package bagsharu.dice;

import java.util.Random;

public class Dice {

    // Todo dado possui os seguintes atributos:
    private int numDado;
    private String nomeDado;
    Random roll = new Random();

    public Dice(int numDado) {
        this.numDado = numDado;
        this.nomeDado = "d" + numDado;
    }
// Método de rolagem de dado

    public void diceRoll(int rollValue) {

        // Imprime o "nome" do dado concatenado com seu número de lados e a rolagem em sequência.
        for (int i = 1; i <= rollValue ; i++) {
            System.out.printf(nomeDado + " = %d\n", (roll.nextInt(numDado) + 1));
        }
    }

    // Método Getter e Setter
    public int getNumDado() {
        return numDado;
    }

    public void setNumDado(int numDado) {
        this.numDado = numDado;
    }


}
