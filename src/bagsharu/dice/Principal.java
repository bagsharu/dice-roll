package bagsharu.dice;

import bagsharu.personagem.*;

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


        Guerreiro guerreiro = new Guerreiro("Brutus",15);
        Mago mago = new Mago("Star",12);
        Ladino ladino = new Ladino("Oscar",18);

//        guerreiro.setNome("Brutus");
//        mago.setNome("Star");
//        ladino.setNome("Oscar");

//        ArrayList<> characters = new ArrayList<>();

        System.out.println(guerreiro.toString());
        System.out.println(mago.toString());
        System.out.println(ladino.toString());


    }
}