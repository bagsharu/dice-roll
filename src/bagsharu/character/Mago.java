package bagsharu.character;

public class Mago extends Character{

    private String magiaFavorita;

    public Mago(String nome, int characterLevel) {
        super(nome, characterLevel);
        super.setClasse("Mago");
        super.setCharacterHP(6);
    }
//    @Override
//    public void characterSheet() {
//        super.setClasse("Mago");
//        super.setCharacterHP(6);
//        super.characterSheet();
//    }
}
