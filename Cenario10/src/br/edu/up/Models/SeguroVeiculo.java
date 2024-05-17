package br.edu.up.Models;

public class SeguroVeiculo extends Seguro {
    private String modeloVeiculo;
    private int anoVeiculo;

    public SeguroVeiculo(String numeroApolice, String titular, double valorSegurado, String modeloVeiculo,
            int anoVeiculo) {
        super(numeroApolice, titular, valorSegurado);
        this.modeloVeiculo = modeloVeiculo;
        this.anoVeiculo = anoVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    @Override
    public String toString() {
        return "SeguroVeiculo [modeloVeiculo=" + modeloVeiculo + ", anoVeiculo=" + anoVeiculo + ", " + super.toString()
                + "]";
    }
}