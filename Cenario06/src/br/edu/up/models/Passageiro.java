package br.edu.up.models;

public class Passageiro extends Pessoa {

    
    private String identificadorBagagem;
    private Passagem passagem;

    public Passageiro(String nome, String rg, String identificadorBagagem, Passagem passagem, Aeronave aeronave){
    super(nome, rg, aeronave);
    this.identificadorBagagem = identificadorBagagem;
    this.passagem = passagem;
}

public String getIdBagagem() {
        return identificadorBagagem;
    }

    public void setIdBagagem(String idBagagem) {
        this.identificadorBagagem = idBagagem;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    @Override
    public String toString() {
        return "Passageiro - identificadorBagagem: " + identificadorBagagem + ", Nome:" + getNome()
                 + ", Rg:" + getRg() + ", Aeronave: " + getAeronave()
                + "]";
    }

    

}


