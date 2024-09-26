package bagsharu.character;

public class Ladino extends Character{

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
