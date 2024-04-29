package src.br.edu.Models;

public class ControladorPrincipal {
    private ControladorVeiculo controladorVeiculos;
    private ControladorRelatorios controladorRelatorios;

    public ControladorPrincipal() {
        Estacionamento estacionamento = new Estacionamento(10); // 10 vagas disponíveis
        Relatorio relatorio = new Relatorio();
        this.controladorVeiculos = new ControladorVeiculos(estacionamento);
        this.controladorRelatorios = new ControladorRelatorios(estacionamento, relatorio);
    }
