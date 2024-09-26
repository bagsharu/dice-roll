package bagsharu.character;

import bagsharu.calc.HitPoints;
import bagsharu.dice.Dice;

public class Character  {

        private String nome;
        private String classe;
        private int characterLevel;
        private int characterHP;
        private Dice hpDice = new Dice(characterHP);

        public Character(String nome, int characterLevel) {

            this.nome = nome;
            this.characterLevel = characterLevel;
        }

    public int getCharacterHP() {
        return characterHP;
    }

    public void setCharacterHP(int characterHP) {
        this.characterHP = characterHP;
    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    protected void setClasse(String classe) {
        this.classe = classe;
    }

    public Dice getHpDice() {
        return hpDice;
    }

    public void setHpDice(Dice hpDice) {
        this.hpDice = hpDice;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    // Imprime a ficha de personagem
    public void characterSheet () {

        System.out.println("\nNome: " + nome);
        System.out.println("\nClasse: " + classe);
        System.out.println("\nPontos de Vida: " + characterHP);

    }
}
