package br.edu.up.models;

public class Aeronave {

    private String codigo;
    private String qtdAssentos;
    private String tipoAeronave;
    
    public Aeronave(String codigo, String tipo, String qtdAssentos) {
        this.codigo = codigo;
        this.tipoAeronave = tipo;
        this.qtdAssentos = qtdAssentos;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getQtdAssentos() {
        return qtdAssentos;
    }
    public void setQtdAssentos(String qtdAssentos) {
        this.qtdAssentos = qtdAssentos;
    }
    public String getTipo() {
        return tipoAeronave;
    }
    public void setTipo(String tipo) {
        this.tipoAeronave = tipo;
    }

    @Override
    public String toString() {
        return "Aeronave [codigo=" + codigo + ", qtdAssentos=" + qtdAssentos + ", tipoAeronave=" + tipoAeronave + "]";
    }

    
    
}
