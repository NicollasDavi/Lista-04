package models;

import java.util.ArrayList;
import java.util.List;

public class Ano {
    private int ano;
    private boolean bisexto;
    private List<Mes> meses;

    public Ano(int ano, boolean bisexto){
        this.ano = ano;
        this.bisexto = bisexto;
        this.meses = new ArrayList<>();
    }

    public void adicionarMes(Mes mes){
        this.meses.add(mes);
    }

    public void excluirCompromisso(String nomeMes, int diaMes, int hora){
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                mes.excluirCompromisso(diaMes, hora);
                return;
            }
        }
        System.out.println("O mês especificado não foi encontrado.");
    }

    public String listarCompromissos(String nomeMes, int diaMes){
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                return mes.listarCompromissos(diaMes);
            }
        }
        return "O mês especificado não foi encontrado.";
    }

    public String listarCompromissos(){
        StringBuilder sb = new StringBuilder();
        for (Mes mes : meses) {
            sb.append(mes.listarCompromissos());
        }
        return sb.toString();
    }
}
