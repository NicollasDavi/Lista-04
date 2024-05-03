public class Professor extends Pessoa {
    private String numeroLattes;
    private SituacaoAluno situacaoAluno;

    public Professor(String nome, String rg, String matricula, String numeroLattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.numeroLattes = numeroLattes;
        this.situacaoAluno = titulacao;
    }

    public String getNumeroLattes() {
        return numeroLattes;
    }

    public void setNumeroLattes(String numeroLattes) {
        this.numeroLattes = numeroLattes;
    }

    public SituacaoAluno getTitulacao() {
        return situacaoAluno;
    }

    public void setTitulacao(SituacaoAluno titulacao) {
        this.situacaoAluno = titulacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número Lattes: " + numeroLattes + ", Titulação: " + titulacao.toString();
    }
}
