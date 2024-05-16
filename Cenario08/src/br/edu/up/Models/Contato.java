package src.br.edu.up.Models;

public abstract class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    private int codigo;
    

    public Contato(int codigo) {
        this.codigo = codigo;
        
    }

    public int getCodigo() {
        return codigo;
    }
}

