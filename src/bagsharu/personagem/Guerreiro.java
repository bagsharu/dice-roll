package bagsharu.personagem;


public class Guerreiro extends Personagem {

    private String trilha;

    public Guerreiro(String nome, int characterLevel) {
        super(nome, characterLevel);
        super.setClasse("Guerreiro");
        super.setCharacterHP(10);
    }

//    @Override
//    public void characterSheet() {
//        super.setClasse("Guerreiro");
//        super.setCharacterHP(10);
//        super.characterSheet();
//    }

}
