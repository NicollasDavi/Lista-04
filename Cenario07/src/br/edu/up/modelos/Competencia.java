public class Competencia {
    private String nome;
    private String tipo;
    private String status;

    public Competencia(String nome, String tipo, String status) {
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isNecessaria() {
        return "Necessária".equals(tipo);
    }

    public boolean isComplementar() {
        return "Complementar".equals(tipo);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Tipo: " + tipo + ", Status: " + status;
    }
}
