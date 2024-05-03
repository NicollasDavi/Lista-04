import java.util.Date;

public class Reserva {
    private String responsavel;
    private int quantidadePessoas;
    private Date dataReserva;
    private double valorTotal;

    public Reserva(String responsavel, int quantidadePessoas, double valorTotal) {
        this.responsavel = responsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.valorTotal = valorTotal;
        this.dataReserva = new Date();
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Responsável: " + responsavel + ", Quantidade de Pessoas: " + quantidadePessoas + ", Data da Reserva: "
                + dataReserva + ", Valor Total: " + valorTotal;
    }
}
