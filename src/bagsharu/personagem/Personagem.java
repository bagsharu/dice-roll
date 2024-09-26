package bagsharu.personagem;

import bagsharu.dice.Dice;

public class Personagem {

        private String nome;
        private String classe;
        private int characterLevel;
        private int characterHP;
        private Dice hpDice = new Dice(characterHP);

        public Personagem(String nome, int characterLevel) {

            this.nome = nome;
            this.characterLevel = characterLevel;
        }

    public int getCharacterHP() {
        return characterHP;
    }

    protected void setCharacterHP(int characterHP) {
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

    protected void setHpDice(Dice hpDice) {
        this.hpDice = hpDice;
    }

    protected void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    // Imprime a ficha de personagem
    public void characterSheet () {

        System.out.println("\nNome: " + nome);
        System.out.println("\nClasse: " + classe);
        System.out.println("\nPontos de Vida: " + characterHP);

    }

    @Override
    public String toString() {
        return "Personagem: " + this.nome + " - Classe: " + this.classe + " - Nivel: " + this.characterLevel;
    }
}
