package bagsharu.personagem;

public class Ladino extends Personagem {

    private String habilidadeEspecial;

    public Ladino(String nome, int characterLevel) {
        super(nome, characterLevel);
        super.setClasse("Ladino");
        super.setCharacterHP(8);
    }

    //    @Override
//    public void characterSheet() {
//        super.setClasse("Ladino");
//        super.setCharacterHP(8);
//        super.characterSheet();
//    }
}
