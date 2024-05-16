package br.edu.up.Models;



public abstract class Cliente {
    protected String nome;
    protected String cpfCnpj;
    protected double vlrEmprestado;

    public Cliente(String nome, String cpfCnpj) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.vlrEmprestado = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public abstract void emprestar(double valor);

    public abstract void devolver(double valor);
}