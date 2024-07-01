package Model;

import java.time.LocalDate;

public abstract class Seguro {
    protected String apolice;
    protected Segurado segurado;
    protected double vlrApolice;
    protected boolean ativo;
    protected LocalDate dtAtivacao;
    protected LocalDate dtFim;

    public Seguro(String apolice, Segurado segurado, double vlrApolice, boolean ativo, LocalDate dtAtivacao, LocalDate dtFim) {
        this.apolice = apolice;
        this.segurado = segurado;
        this.vlrApolice = vlrApolice;
        this.ativo = ativo;
        this.dtAtivacao = dtAtivacao;
        this.dtFim = dtFim;
    }

    // Getters e setters
    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public double getVlrApolice() {
        return vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDtAtivacao() {
        return dtAtivacao;
    }

    public void setDtAtivacao(LocalDate dtAtivacao) {
        this.dtAtivacao = dtAtivacao;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public abstract String getDados();
}
