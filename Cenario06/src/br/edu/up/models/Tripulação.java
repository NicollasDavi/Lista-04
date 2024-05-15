package br.edu.up.models;

public class Tripulação extends Pessoa {

    private String idAeronautica;
    private String matriculaFuncionario;

    public Tripulação(String nome, String rg, int IdAeronautica, String matriculaFuncionario){
        super(nome, rg);
        this.matriculaFuncionario = matriculaFuncionario;
        this.idAeronautica = idAeronautica;

    }

    public String getIdAeronautica() {
        return idAeronautica;
    }
    public void setIdAeronautica(String idAeronautica) {
        this.idAeronautica = idAeronautica;
    }
    public String getMatriculaFuncionario() {
        return matriculaFuncionario;
    }
    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    

    

}
