package br.edu.up.models;

public class Tripulação extends Pessoa {

    private String idAeronautica;
    private String matricula;

    public Tripulação(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula){
        super(nome, rg, aeronave);
        this.matricula = matricula;
        this.idAeronautica = idAeronautica;

    }

    public String getIdAeronautica() {
        return idAeronautica;
    }
    public void setIdAeronautica(String idAeronautica) {
        this.idAeronautica = idAeronautica;
    }
    public String getMatriculaFuncionario() {
        return matricula;
    }
    public void setMatriculaFuncionario(String matriculaFuncionario) {
        this.matricula = matriculaFuncionario;
    }

    @Override
    public String toString() {
        return "Tripulação [idAeronautica=" + idAeronautica + ", matricula=" + matricula + "]";
    }

    
    

    

}
