package Model;

import java.time.LocalDate;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(String apolice, Segurado segurado, double vlrApolice, boolean ativo, LocalDate dtAtivacao, LocalDate dtFim, double vlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice, segurado, vlrApolice, ativo, dtAtivacao, dtFim);
        this.vlrFranquia = vlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }

    // Getters e setters
    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "SeguroVeiculo [apolice=" + apolice + ", segurado=" + segurado.getNome() + ", valor=" + vlrApolice + ", ativo=" + ativo + ", franquia=" + vlrFranquia + ", carroReserva=" + temCarroReserva + ", vidros=" + cobreVidros + "]";
    }
}
