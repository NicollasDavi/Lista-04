package br.edu.up.telas;

public class DiaTelas {
    public void notificarCompromissoRealizado( int hora, String pessoa, String local, String assunto){
        System.out.println("Compromisso agendado para às " + hora + "h: " +
        "Pessoa: " + pessoa + ", Local: " + local + ", Assunto: " + assunto);
    }

    public void notificarCompromissoJaAgendado(int hora){
        System.out.println("Já existe um compromisso agendado para às " + hora + "h.");
    }
}
