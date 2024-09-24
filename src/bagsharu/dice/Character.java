package bagsharu.dice;

public class Character {

        private String nome;
        private String classe;
        private int PV;
        private int PE;

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

    public int getPV() {
        return PV;
    }

    public void setPV(int PV) {
        this.PV = PV;
    }

    public int getPE() {
        return PE;
    }

    public void setPE(int PE) {
        this.PE = PE;
    }

    // Imprime a ficha de personagem
    public void characterSheet () {

        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("PV: " + PV + " PE: " + PE );

    }

}
