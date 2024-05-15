package br.edu.up.models;

public class Passageiro extends Pessoa {

    private int idBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg, int idBagagem, Passagem passagem){
    super(nome, rg);
    this.idBagagem = idBagagem;
    this.passagem = passagem;
}

public int getIdBagagem() {
        return idBagagem;
    }

    public void setIdBagagem(int idBagagem) {
        this.idBagagem = idBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

}


