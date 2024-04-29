package src.br;

public class ControladorVeiculo {
    
    private Estacionamento estacionamento;
    
    public ControladorVeiculos(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }
    
    // Métodos para entrada e saída de veículos
    public boolean estacionarVeiculo(String modelo, String placa, String cor) {
        ModeloVeiculo veiculo = new ModeloVeiculo(modelo, placa, cor);
        return estacionamento.estacionarVeiculo(veiculo);
    }
    
    public boolean removerVeiculo(String placa) {
        return estacionamento.removerVeiculo(placa);
    }
}

}
