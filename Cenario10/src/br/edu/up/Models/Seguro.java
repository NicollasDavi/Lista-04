package br.edu.up.Models;

public abstract class Seguro {
    private String numeroApolice;
    private String titular;
    private double valorSegurado;

    public Seguro(String numeroApolice, String titular, double valorSegurado) {
        this.numeroApolice = numeroApolice;
        this.titular = titular;
        this.valorSegurado = valorSegurado;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public void setValorSegurado(double valorSegurado) {
        this.valorSegurado = valorSegurado;
    }

    @Override
    public String toString() {
        return "Seguro [numeroApolice=" + numeroApolice + ", titular=" + titular + ", valorSegurado=" + valorSegurado
                + "]";
    }
}