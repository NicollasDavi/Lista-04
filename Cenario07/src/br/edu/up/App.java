package br.edu.up;
import br.edu.up.models.Aluno;
import br.edu.up.*;
import java.util.List;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João", "123456", "2021001", 2021, "Engenharia", "Noturno");
        Aluno aluno2 = new Aluno("Maria", "654321", "2021002", 2021, "Medicina", "Diurno");


        Professor professor = new Professor("Dr. Silva", "7891011", "PRF001", "Lattes123");


        Disciplina disciplina = new Disciplina("Cálculo I", "CAL001", "Matemática");

     
        disciplina.setProfessor(professor);

       
        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);


        Competencia comp1 = new Competencia("Derivadas", "Necessária", "Em andamento");
        Competencia comp2 = new Competencia("Integrais", "Necessária", "Concluída");

        // Adicionar competências à disciplina
        disciplina.adicionarCompetencia(comp1);
        disciplina.adicionarCompetencia(comp2);


        SituacaoAluno situacaoAluno1 = new SituacaoAluno(aluno1, disciplina);
        SituacaoAluno situacaoAluno2 = new SituacaoAluno(aluno2, disciplina);

        // Calcular situação dos alunos
        situacaoAluno1.calcularSituacao();
        situacaoAluno2.calcularSituacao();

      
        System.out.println("Disciplinas:");
        System.out.println(disciplina);

        System.out.println("\nAlunos:");
        System.out.println(aluno1);
        System.out.println(aluno2);

        System.out.println("\nProfessores:");
        System.out.println(professor);

        System.out.println("\nSituação dos Alunos:");
        System.out.println(situacaoAluno1);
        System.out.println(situacaoAluno2);
    }
}
