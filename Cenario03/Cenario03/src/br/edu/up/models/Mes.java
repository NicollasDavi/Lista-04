package models;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia dias[];

    public Mes(int qtdeDias, String nome){
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(int diaMes, String local, String pessoa, String assunto, int hora){
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            Compromisso comp = new Compromisso(pessoa, local, assunto, hora);
            dias[diaMes - 1].adicionarCompromisso(comp);
        } else {
            System.out.println("O dia especificado não é válido para este mês.");
        }
    }

    public void excluirCompromisso(int diaMes, int hora){
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1].excluirCompromisso(hora);
        } else {
            System.out.println("O dia especificado não é válido para este mês.");
        }
    }

    public String listarCompromissos(){
        StringBuilder sb = new StringBuilder();
        for (Dia dia : dias) {
            sb.append(dia.listarCompromissos());
        }
        return sb.toString();
    }

    public String listarCompromissos(int diaMes){
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            return dias[diaMes - 1].listarCompromissos();
        } else {
            return "O dia especificado não é válido para este mês.";
        }
    }

    public String getNome() {
        return nome;
    }
}
