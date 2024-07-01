package Model;

public class Segurado {
    private String nome;
    private String rg;
    private String cpf;
    private String sexo;
    private String endereco;
    private String cidade;
    private String cep;
    private String telefone;

    public Segurado(String nome, String rg, String cpf, String sexo, String endereco, String cidade, String cep, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
        this.telefone = telefone;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Segurado [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", sexo=" + sexo + ", endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", telefone=" + telefone + "]";
    }
}
