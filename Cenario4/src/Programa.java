import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorPrincipal controlador = new ControladorPrincipal();

        int opcao;
        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Estacionar Veículo");
            System.out.println("2. Remover Veículo");
            System.out.println("3. Gerar Relatório");
            System.out.println("4. Sair do Programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Estacionar Veículo
                    System.out.print("Modelo do Veículo: ");
                    String modelo = scanner.next();
                    System.out.print("Placa do Veículo: ");
                    String placa = scanner.next();
                    System.out.print("Cor do Veículo: ");
                    String cor = scanner.next();
                    controlador.estacionarVeiculo(modelo, placa, cor);
                    break;
                case 2:
                    // Remover Veículo
                    System.out.print("Placa do Veículo a ser removido: ");
                    String placaRemover = scanner.next();
                    controlador.removerVeiculo(placaRemover);
                    break;
                case 3:
                    // Gerar Relatório
                    controlador.gerarRelatorio();
                    break;
                case 4:
                    // Sair do Programa
                    System.out.println("Encerrando o Programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
