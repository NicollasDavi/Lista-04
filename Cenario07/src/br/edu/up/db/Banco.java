package br.edu.up.db;

import br.edu.up.controles.AlunoControle;
import br.edu.up.controles.DisciplinaControle;
import br.edu.up.controles.ProfessorControle;

public class Banco {

    public static ProfessorControle ctlrProfessor = new ProfessorControle();
    public static AlunoControle ctlrAluno = new AlunoControle();
    public static DisciplinaControle ctlrDisciplina = new DisciplinaControle();
}