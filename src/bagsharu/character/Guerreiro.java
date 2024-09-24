package bagsharu.character;

public class Guerreiro extends Character{

    private String trilha;

    @Override
    public void characterSheet() {
        super.setClasse("Guerreiro");
        super.setCharacterHP(10);
        super.characterSheet();
    }
}
