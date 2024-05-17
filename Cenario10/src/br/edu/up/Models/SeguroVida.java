package br.edu.up.Models;

public class SeguroVida extends Seguro {
    private int idadeSegurado;

    public SeguroVida(String numeroApolice, String titular, double valorSegurado, int idadeSegurado) {
        super(numeroApolice, titular, valorSegurado);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    @Override
    public String toString() {
        return "SeguroVida [idadeSegurado=" + idadeSegurado + ", " + super.toString() + "]";
    }
}
