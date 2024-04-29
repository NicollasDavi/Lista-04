package src.br.edu.Models;

import java.util.HashMap;
import java.util.Map;

public class Relatorio {
    private int entradasManha;
    private int saidasManha;
    private int entradasTarde;
    private int saidasTarde;
    private int entradasNoite;
    private int saidasNoite;

    private Map<String, Integer> entradasPorPeriodo;
    private Map<String, Integer> saidasPorPeriodo;
    private double receitaTotal;

    // Construtor
    public Relatorio() {
        this.entradasPorPeriodo = new HashMap<>();
        this.saidasPorPeriodo = new HashMap<>();
        this.receitaTotal = 0.0;
    }

    // Método para atualizar o relatório com base nas entradas e saídas
    public void atualizarRelatorio(String periodo, int entradas, int saidas, double valorPorEntrada) {
        entradasPorPeriodo.put(periodo, entradas);
        saidasPorPeriodo.put(periodo, saidas);
        receitaTotal += entradas * valorPorEntrada;
    }

    // Método para gerar o relatório formatado
    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório de Entradas e Saídas:\n");
        for (String periodo : entradasPorPeriodo.keySet()) {
            int entradas = entradasPorPeriodo.getOrDefault(periodo, 0);
            int saidas = saidasPorPeriodo.getOrDefault(periodo, 0);
            relatorio.append(String.format("%s - Entradas: %d, Saídas: %d\n", periodo, entradas, saidas));
        }
        relatorio.append(String.format("Receita Total: R$ %.2f\n", receitaTotal));
        return relatorio.toString();
    }
}
