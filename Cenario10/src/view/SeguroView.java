package View;

import java.time.LocalDate;
import java.util.Scanner;
import Controller.*;
import Model.*;


public class SeguroView {
    private SeguroController controller;
    private Scanner scanner;

    public SeguroView(SeguroController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeSeguros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    private void incluirSeguro() {
        System.out.print("Informe o tipo de seguro (vida/veiculo): ");
        String tipo = scanner.nextLine();

        System.out.print("Informe o número da apólice: ");
        String apolice = scanner.nextLine();

        System.out.print("Informe o nome do segurado: ");
        String nome = scanner.nextLine();
        // Demais dados do segurado
        Segurado segurado = new Segurado(nome, "", "", "", "", "", "", "");

        System.out.print("Informe o valor da apólice: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Seguro está ativo (true/false): ");
        boolean ativo = scanner.nextBoolean();
        scanner.nextLine(); // Consome a nova linha

        LocalDate dtAtivacao = LocalDate.now();
        LocalDate dtFim = dtAtivacao.plusYears(1);

        Seguro seguro;
        if (tipo.equalsIgnoreCase("vida")) {
            System.out.print("Cobre doença (true/false): ");
            boolean cobreDoenca = scanner.nextBoolean();
            System.out.print("Cobre acidente (true/false): ");
            boolean cobreAcidente = scanner.nextBoolean();
            seguro = new SeguroVida(apolice, segurado, valor, ativo, dtAtivacao, dtFim, cobreDoenca, cobreAcidente);
        } else if (tipo.equalsIgnoreCase("veiculo")) {
            System.out.print("Valor da franquia: ");
            double vlrFranquia = scanner.nextDouble();
            System.out.print("Tem carro reserva (true/false): ");
            boolean temCarroReserva = scanner.nextBoolean();
            System.out.print("Cobre vidros (true/false): ");
            boolean cobreVidros = scanner.nextBoolean();
            seguro = new SeguroVeiculo(apolice, segurado, valor, ativo, dtAtivacao, dtFim, vlrFranquia, temCarroReserva, cobreVidros);
        } else {
            System.out.println("Tipo de seguro inválido.");
            return;
        }

        controller.incluirSeguro(seguro);
    }

    private void localizarSeguro() {
        System.out.print("Informe o número da apólice: ");
        String apolice = scanner.nextLine();
        Seguro seguro = controller.localizarSeguro(apolice);
        if (seguro != null) {
            System.out.println("Seguro encontrado: " + seguro.getDados());
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    private void excluirSeguro() {
        System.out.print("Informe o número da apólice: ");
        String apolice = scanner.nextLine();
        controller.excluirSeguro(apolice);
    }

    private void excluirTodosSeguros() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (true/false): ");
        boolean confirmacao = scanner.nextBoolean();
        if (confirmacao) {
            controller.excluirTodosSeguros();
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private void listarTodosSeguros() {
        controller.listarTodosSeguros();
    }

    private void verQuantidadeSeguros() {
        int quantidade = controller.quantidadeSeguros();
        System.out.println("Quantidade de seguros: " + quantidade);
    }
}
