import java.util.Scanner;

import models.Ano;
import models.Compromisso;
import models.Mes;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um ano
        Ano ano = new Ano(2024, true);
        
        // Criando alguns meses
        Mes[] meses = new Mes[12];
        meses[0] = new Mes(31, "Janeiro");
        meses[1] = new Mes(29, "Fevereiro"); // considerando ano bissexto
        meses[2] = new Mes(31, "Março");
        meses[3] = new Mes(30, "Abril");
        meses[4] = new Mes(31, "Maio");
        meses[5] = new Mes(30, "Junho");
        meses[6] = new Mes(31, "Julho");
        meses[7] = new Mes(31, "Agosto");
        meses[8] = new Mes(30, "Setembro");
        meses[9] = new Mes(31, "Outubro");
        meses[10] = new Mes(30, "Novembro");
        meses[11] = new Mes(31, "Dezembro");

        // Adicionando os meses ao ano
        for (Mes mes : meses) {
            ano.adicionarMes(mes);
        }

        // Menu principal
        int opcao;
        do {
            System.out.println("\n--- Agenda ---");
            System.out.println("1. Adicionar compromisso");
            System.out.println("2. Listar todos os compromissos");
            System.out.println("3. Listar compromissos de um mês específico");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarCompromisso(ano, scanner);
                    break;
                case 2:
                    System.out.println("\nTodos os compromissos:");
                    System.out.println(ano.listarCompromissos());
                    break;
                case 3:
                    System.out.print("Digite o nome do mês: ");
                    String nomeMes = scanner.next();
                    System.out.println("\nCompromissos de " + nomeMes + ":");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void adicionarCompromisso(Ano ano, Scanner scanner) {
        System.out.print("Digite o nome do mês: ");
        String nomeMes = scanner.next();
        Mes mes = null;
   
    }
}
