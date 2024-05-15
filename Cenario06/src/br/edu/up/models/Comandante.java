package br.edu.up.models;

public class Comandante extends Tripulação {

    

    private int totalHorasVoo;

    public Comandante(String nome, String rg, String identificacaoAeronautica, String matricula, int totalHorasVoo) {
        super(nome, rg, idAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    }
    public int getTotalHorasVoo() {
        return totalHorasVoo;
    }

    public void setTotalHorasVoo(int totalHorasVoo) {
        this.totalHorasVoo = totalHorasVoo;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

}
