package models;

public class Dia {
    private int diaMes;
    private Compromisso compromissos[];

    public Dia(int diaMes){
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp){
        compromissos[comp.getHora()] = comp;
    }

    public Compromisso consultarCompromisso(int hora){
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora){
        compromissos[hora] = null;
    }

    public String listarCompromissos(){
        StringBuilder sb = new StringBuilder();
        for (Compromisso compromisso : compromissos) {
            if (compromisso != null) {
                sb.append(compromisso.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
