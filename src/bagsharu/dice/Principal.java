package bagsharu.dice;

import java.util.Scanner;

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
        Arqueiro arqueiro = new Arqueiro();

        guerreiro.setNome("Brutus");
        guerreiro.setClasse("Guerreiro");

        mago.setNome("Star");
        mago.setClasse("Mago");

        arqueiro.setNome("Oscar");
        arqueiro.setClasse("Arqueiro");

        guerreiro.characterSheet();
        mago.characterSheet();
        arqueiro.characterSheet();


    }
}