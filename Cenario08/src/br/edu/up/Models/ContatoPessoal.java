package src.br.edu.up.Models;

public class ContatoPessoal extends Contato {
    private String endereco;

    public ContatoPessoal(String nome, String telefone, String endereco) {
        super(nome, telefone);
        this.endereco = endereco;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
