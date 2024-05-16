package br.edu.up.Models;

public class ClientePessoa extends Cliente {
    private static final double MAX_CREDITO = 10000.0;

    public ClientePessoa(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= MAX_CREDITO) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$" + valor + " realizado para o cliente pessoa " + nome);
        } else {
            System.out.println("Empréstimo excede o limite de crédito para o cliente pessoa " + nome);
        }
    }

    @Override
    public void devolver(double valor) {
        vlrEmprestado -= valor;
        System.out.println("Devolução de R$" + valor + " realizada para o cliente pessoa " + nome);
    }
}