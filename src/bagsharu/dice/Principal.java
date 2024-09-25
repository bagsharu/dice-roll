package bagsharu.dice;

import bagsharu.character.*;

public class Principal {
    public static void main(String[] args) {

//        // Instanciando objetos
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Insira quantos lados tem o dado:");
//        int numDado = scanner.nextInt();
//
//        Dice dadinho = new Dice(numDado);
//
//        System.out.println("Agora, quantas rolagens você deseja:");
//        int numRolagens = scanner.nextInt();
//
//
//        dadinho.diceRoll(numRolagens);


        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();
        Ladino ladino = new Ladino();

        guerreiro.setNome("Brutus");
        guerreiro.setCharacterLevel(11);
        mago.setNome("Star");
        mago.setCharacterLevel(9);
        ladino.setNome("Oscar");
        ladino.setCharacterLevel(16);

        guerreiro.characterSheet();
        mago.characterSheet();
        ladino.characterSheet();


    }
}