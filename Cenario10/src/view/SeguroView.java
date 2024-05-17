package view;

import java.util.Scanner;
import br.edu.up.Models.Seguro;
import br.edu.up.Models.SeguroVeiculo;
import br.edu.up.Models.SeguroVida;

public class SeguroView {
    private Scanner scanner;

    public SeguroView() {
        scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Seguro criarSeguro() {
        System.out.print("Digite o tipo de seguro (1 - Vida, 2 - Veículo): ");
        int tipo = scanner.nextInt();
        System.out.print("Digite o número da apólice: ");
        String numeroApolice = scanner.next();
        System.out.print("Digite o titular: ");
        String titular = scanner.next();
        System.out.print("Digite o valor segurado: ");
        double valorSegurado = scanner.nextDouble();

        if (tipo == 1) {
            System.out.print("Digite a idade do segurado: ");
            int idadeSegurado = scanner.nextInt();
            return new SeguroVida(numeroApolice, titular, valorSegurado, idadeSegurado);
        } else {
            System.out.print("Digite o modelo do veículo: ");
            String modeloVeiculo = scanner.next();
            System.out.print("Digite o ano do veículo: ");
            int anoVeiculo = scanner.nextInt();
            return new SeguroVeiculo(numeroApolice, titular, valorSegurado, modeloVeiculo, anoVeiculo);
        }
    }

    public String solicitarNumeroApolice() {
        System.out.print("Digite o número da apólice: ");
        return scanner.next();
    }

    public void exibirSeguro(Seguro seguro) {
        if (seguro != null) {
            System.out.println(seguro);
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    public void confirmarExclusao() {
        System.out.print("Tem certeza que deseja excluir todos os seguros? (s/n): ");
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}