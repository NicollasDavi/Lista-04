import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String identificador;
    private String curriculo;
    private List<Competencia> competenciasNecessarias;
    private List<Competencia> competenciasComplementares;
    private Professor professor;
    private List<Aluno> alunosMatriculados;
    private List<SituacaoAluno> situacoes;

    public Disciplina(String nome, String identificador, String curriculo) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competenciasNecessarias = new ArrayList<>();
        this.competenciasComplementares = new ArrayList<>();
        this.alunosMatriculados = new ArrayList<>();
        this.situacoes = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunosMatriculados.remove(aluno);
    }

    public void adicionarCompetencia(Competencia competencia) {
        if (competencia.isNecessaria()) {
            competenciasNecessarias.add(competencia);
        } else {
            competenciasComplementares.add(competencia);
        }
    }

    public void removerCompetencia(Competencia competencia) {
        if (competencia.isNecessaria()) {
            competenciasNecessarias.remove(competencia);
        } else {
            competenciasComplementares.remove(competencia);
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void calcularSituacaoAluno(Aluno aluno) {
        // Lógica para calcular a situação do aluno com base nas competências atingidas
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Identificador: " + identificador + ", Currículo: " + curriculo + ", Professor: "
                + (professor != null ? professor.getNome() : "Nenhum") + ", Alunos Matriculados: "
                + alunosMatriculados.size();
    }
}
