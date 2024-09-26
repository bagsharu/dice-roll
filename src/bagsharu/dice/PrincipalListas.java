package bagsharu.dice;

import bagsharu.personagem.Guerreiro;
import bagsharu.personagem.Ladino;
import bagsharu.personagem.Mago;
import bagsharu.personagem.Personagem;

import java.util.ArrayList;

public class PrincipalListas {

    public static void main(String[] args) {

        ArrayList<Personagem> lista = new ArrayList<>();

        Guerreiro guerreiro = new Guerreiro("Golias",12);
        Ladino ladino = new Ladino("Gaspar", 11);
        Mago mago = new Mago("Horácio", 13);

        lista.add(guerreiro);
        lista.add(ladino);
        lista.add(mago);

        for (Personagem perso : lista) {

            System.out.println(perso);
        }

    }
}
