package br.edu.up.models;

public class Comandante extends Tripulação {

    

    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matricula, int totalHorasVoo, Aeronave aeronave) {
        super(nome, rg, aeronave, identificacaoAeronautica, matricula);
        this.totalHorasVoo = totalHorasVoo;
    }

    
    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }


    @Override
    public String toString() {
        return "Comandante - Horas de Voo: " + totalHorasVoo + ", Aeronave: " + aeronave + ", Nome:" + getNome()
                + ", IdAeronautica: " + getIdAeronautica() + ", Rg:" + getRg() + ", MatriculaFuncionario:"
                + getMatriculaFuncionario() + "]";
    }

    
    
}
