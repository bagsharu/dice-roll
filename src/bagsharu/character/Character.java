package bagsharu.character;

public class Character {

        private String nome;
        private String classe;
        private int characterHP;

    public int getCharacterHP() {
        return characterHP;
    }

    public void setCharacterHP(int characterHP) {
        this.characterHP = characterHP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


    // Imprime a ficha de personagem
    public void characterSheet () {

        System.out.println("\nNome: " + nome);
        System.out.println("\nClasse: " + classe);
        System.out.println("\nPontos de Vida: " + characterHP);

    }

}
