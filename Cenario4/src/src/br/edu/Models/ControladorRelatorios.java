package src.br.edu.Models;

public class ControladorRelatorios {
    private Estacionamento estacionamento;
    private Relatorio relatorio;

    public ControladorRelatorios(Estacionamento estacionamento, Relatorio relatorio) {
        this.estacionamento = estacionamento;
        this.relatorio = relatorio;
    }

    // Métodos para gerar relatórios
    public String gerarRelatorio() {
        // gerar relatório
        return relatorio.gerarRelatorio();
    }
}
