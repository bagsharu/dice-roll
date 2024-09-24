package bagsharu.character;

public class Ladino extends Character{

    private String habilidadeEspecial;

    @Override
    public void characterSheet() {
        super.setClasse("Ladino");
        super.setCharacterHP(8);
        super.characterSheet();
    }
}
