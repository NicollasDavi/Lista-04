import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {
    private EventoController eventoController;
    private ReservaController reservaController;
    private MenuView menuView;
    private Scanner scanner;

    public Programa() {
        eventoController = new EventoController();
        reservaController = new ReservaController();
        menuView = new MenuView();
        scanner = new Scanner(System.in);
    }

    public void executar() {
        int opcao;
        do {
            opcao = menuView.exibirMenu();
            menuView.limparBuffer();

            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    listarEventos();
                    break;
                case 3:
                    fazerReserva();
                    break;
                case 4:
                    listarReservas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private void adicionarEvento() {
        System.out.println("=== Adicionar Evento ===");
        String nome = lerInput("Nome: ");
        String dataStr = lerInput("Data (dd/MM/yyyy): ");
        String local = lerInput("Local: ");
        int lotacaoMaxima = Integer.parseInt(lerInput("Lotação Máxima: "));
        double precoIngresso = Double.parseDouble(lerInput("Preço do Ingresso: "));

        Date data = null;
        try {
            data = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Evento evento = new Evento(nome, data, local, lotacaoMaxima, precoIngresso);
        eventoController.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso!");
    }

    private String lerInput(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    private void listarEventos() {
        List<Evento> eventos = eventoController.listarEventos();
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento encontrado.");
        } else {
            System.out.println("=== Eventos Disponíveis ===");
            for (int i = 0; i < eventos.size(); i++) {
                System.out.println((i + 1) + ". " + eventos.get(i));
            }
        }
    }

    private void fazerReserva() {
        listarEventos();
        int numeroEvento = Integer.parseInt(lerInput("Digite o número do evento para fazer a reserva: ")) - 1;

        List<Evento> eventos = eventoController.listarEventos();
        if (numeroEvento >= 0 && numeroEvento < eventos.size()) {
            Evento eventoSelecionado = eventos.get(numeroEvento);
            String responsavel = lerInput("Responsável pela reserva: ");
            int quantidadePessoas = Integer.parseInt(lerInput("Quantidade de pessoas: "));

            if (eventoSelecionado.getIngressosVendidos() + quantidadePessoas <= eventoSelecionado.getLotacaoMaxima()) {
                double valorTotal = quantidadePessoas * eventoSelecionado.getPrecoIngresso();
                Reserva reserva = new Reserva(responsavel, quantidadePessoas, valorTotal, eventoSelecionado);
                reservaController.fazerReserva(reserva);
                eventoSelecionado.setIngressosVendidos(eventoSelecionado.getIngressosVendidos() + quantidadePessoas);
                System.out.println("Reserva feita com sucesso!");
            } else {
                System.out.println("Não há ingressos disponíveis para este evento.");
            }
        } else {
            System.out.println("Evento não encontrado.");
        }
    }

    private void listarReservas() {
        List<Reserva> reservas = reservaController.listarReservas();
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva encontrada.");
        } else {
            System.out.println("=== Reservas ===");
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.executar();
    }
}
