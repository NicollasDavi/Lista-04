package src.br.edu.Models;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private List<Veiculo> veiculosEstacionados;
    private int vagasDisponiveis;

    public Estacionamento(int vagasMaximas) {
        this.veiculosEstacionados = new ArrayList<>();
        this.vagasDisponiveis = vagasMaximas;
    }

    public boolean estacionarVeiculo(Veiculo veiculo) {
        if (vagasDisponiveis > 0) {
            veiculosEstacionados.add(veiculo);
            vagasDisponiveis--;
            return true;
        } else {
            return false;
        }
    }

    public boolean removerVeiculo(String placa) {
        for (Veiculo veiculo : veiculosEstacionados) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculosEstacionados.remove(veiculo);
                vagasDisponiveis++;
                return true;
            }
        }
        return false;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

}
