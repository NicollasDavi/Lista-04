package br.edu.up.controles;
import br.edu.up.models.*;
import br.edu.up.telas.*;

public class ControleDeAgenda {

    private Ano ano;

    public ControleDeAgenda(Ano ano) {
        this.ano = ano;
    }

    public String addCompromisso(int mes, int dia, int hora, String pessoa, String local, String assunto) {
        ano.addCompromisso(mes, dia, hora, pessoa, local, assunto);
        if (ano.addCompromisso(mes, dia, hora, pessoa, local, assunto) != "ok") {
            return "Compromisso Realizado!!";
        } else {
            return "Compromisso já realizado";
        }
    }

    public String consultarCompromisso(int mes, int dia, int hora) {
        String str = ano.consultarCompromisso(mes, dia, hora);
        if(str != null){
            return str;
        }else{
            return "Compromisso não encontrado!!";
        }
    }
    public String removerCompromisso(int mes, int dia, int hora){
        ano.removerCompromisso(mes, dia, hora);
        if(ano.removerCompromisso(mes, dia, hora) != null){
            return "Compromisso excluído com sucesso!";
        }else{
            return "Compromisso não encontrado!";
        }
    }

    public String listarTodosCompromissos() {
        StringBuilder resultado = new StringBuilder(); 
        // Itera sobre todos os meses do ano
        for (int i = 0; i < ano.getMeses().length; i++) {
            Mes mes = ano.getMeses()[i];           
            // Verifica se o mês está inicializado e se tem compromissos agendados
            if (mes != null && mes.temCompromissos()) {
                resultado.append("Compromissos agendados para ").append(mes.getNomeMes()).append(":\n");
                resultado.append(mes.listarTodosCompromissos()).append("\n\n");
            }
        }       
        // Verifica se foram encontrados compromissos
        if (resultado.length() == 0) {
            resultado.append("Não há compromissos agendados.\n");
        }       
        return resultado.toString();
    }

    public String listarCompromissosDoMes(int mes){
        StringBuilder resultado = new StringBuilder();

        //verifica se o Mês especificados está dentro do intervalo válido
        if(mes < 1 || mes > 12){
            resultado.append("Mês inválido. \n");
            return resultado.toString();
        }

        //Obtem o mês correspondente ao indice
        Mes mesSelecionado = ano.getMeses()[mes - 1];

        //Verifica se o mes está inicializado e se tem compromissos agendados
        if(mesSelecionado != null && mesSelecionado.temCompromissos()){
            resultado.append("Compromissos agendados para ").append(mesSelecionado.getNomeMes()).append(":\n");
            resultado.append(mesSelecionado.listarTodosCompromissos()).append("\n\n");
        } else {
            resultado.append("Não há compromissos agendados para o mês ").append(mes).append(".\n");
        }
        return resultado.toString();
    }



    

}
