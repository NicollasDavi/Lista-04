package br.edu.up.Models;

public class ClienteEmpresa extends Cliente {
    private static final double MAX_CREDITO = 25000.0;

    public ClienteEmpresa(String nome, String cnpj) {
        super(nome, cnpj);
    }

    @Override
    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= MAX_CREDITO) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$" + valor + " realizado para o cliente empresa " + nome);
        } else {
            System.out.println("Empréstimo excede o limite de crédito para o cliente empresa " + nome);
        }
    }

    @Override
    public void devolver(double valor) {
        vlrEmprestado -= valor;
        System.out.println("Devolução de R$" + valor + " realizada para o cliente empresa " + nome);
    }
}