package bagsharu.character;

public class Mago extends Character{

    private String magiaFavorita;

    @Override
    public void characterSheet() {
        super.setClasse("Mago");
        super.setCharacterHP(6);
        super.characterSheet();
    }
}
