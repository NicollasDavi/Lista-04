package br.edu.up.controles;

import br.edu.up.db.*;
import br.edu.up.models.*;

public class AlunoControle {

Aluno[] alunos = new Aluno[2];

public String registrarAluno(String nome, int rg, int matricula, String curso, String turno, int anoDeIngresso ){

    for(int i=0; i< alunos.length; i++){
        if (alunos[i] == null) {
            alunos[i] = new Aluno(nome, rg, matricula, curso, turno, anoDeIngresso);
            
            return "ok";
        }
    }
    return "null";


}

public void listarAlunos(){
    for(int i=0; i< alunos.length; i++){
        if (alunos[i] != null) {
            System.out.println("Nome " + alunos[i].getNome());
            System.out.println("RG " + alunos[i].getRg());
            System.out.println("Matrícula " + alunos[i].getMatricula());
            System.out.println("Curso " + alunos[i].getCurso());
            System.out.println("Turno " + alunos[i].getTurno());
            System.out.println("Ano de Ingresso " + alunos[i].getAnoDeIngresso());
            System.out.println("----------");
        }

    }

}

public String alterarAluno(int matricula, String atributo, Object novoValor) {
    for(int i = 0; i < alunos.length; i++) {
        if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
            switch (atributo.toLowerCase()) {
                case "nome":
                    alunos[i].setNome((String) novoValor);
                    break;
                case "rg":
                    alunos[i].setRg((int) novoValor);
                    break;
                case "curso":
                    alunos[i].setCurso((String) novoValor);
                    break;
                case "turno":
                    alunos[i].setTurno((String) novoValor);
                    break;
                case "anoDeIngresso":
                    alunos[i].setAnoDeIngresso((int) novoValor);
                    break;
                default:
                    System.out.println("Atributo inválido.");
                    return "Atributo inválido.";
            }
            System.out.println("Aluno alterado com sucesso!");
            return "Aluno alterado com sucesso!";
        }
    }
    System.out.println("Aluno não encontrado com a matrícula fornecida.");
    return atributo;
}





    public String excluirAluno(int matricula){
        for(int i=0; i < alunos.length; i++){
            if (alunos[i] != null && alunos[i].getMatricula() == matricula) {
                alunos[i] = null;
                return "ok";
            }
        }
        return "null";
        
    }

}