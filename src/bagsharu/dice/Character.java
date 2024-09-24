package bagsharu.dice;

public class Character {

        private String nome;
        private String classe;

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

        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);

    }

}
