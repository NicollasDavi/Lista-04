package br.edu.up.models;

public class Aeronave {

    public Aeronave(String codigo, String tipo, int quantidadeAssentos) {
        this.codigo = codigo;
        this.tipoAeronave = tipo;
        this.qtdAssentos = quantidadeAssentos;
    }

    private String codigo;
    private int qtdAssentos;
    private String tipoAeronave;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getQtdAssentos() {
        return qtdAssentos;
    }
    public void setQtdAssentos(int qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }
    public String getTipo() {
        return tipoAeronave;
    }
    public void setTipo(String tipo) {
        this.tipoAeronave = tipo;
    }

    
    
}
