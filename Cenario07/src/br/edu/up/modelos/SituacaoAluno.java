import java.util.List;
import java.util.ArrayList;

public class SituacaoAluno {
    private Aluno aluno;
    private Disciplina disciplina;
    private List<Competencia> competenciasAtingidas;
    private List<Competencia> competenciasNaoAtingidas;
    private String situacao;

    public SituacaoAluno(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.competenciasAtingidas = new ArrayList<>();
        this.competenciasNaoAtingidas = new ArrayList<>();
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public List<Competencia> getCompetenciasAtingidas() {
        return competenciasAtingidas;
    }

    public List<Competencia> getCompetenciasNaoAtingidas() {
        return competenciasNaoAtingidas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void calcularSituacao() {
        // Lógica para calcular a situação do aluno em relação à disciplina
    }

    @Override
    public String toString() {
        return "Aluno: " + aluno.getNome() + ", Disciplina: " + disciplina.getNome() + ", Situação: " + situacao;
    }
}
