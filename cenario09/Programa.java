import java.util.Scanner;
import br.edu.up.Models.*;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Cliente cliente = null;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Incluir cliente pessoa");
            System.out.println("2. Incluir cliente empresa");
            System.out.println("3. Mostrar dados cliente pessoa");
            System.out.println("4. Mostrar dados cliente empresa");
            System.out.println("5. Emprestar para cliente pessoa");
            System.out.println("6. Emprestar para cliente empresa");
            System.out.println("7. Devolução de cliente pessoa");
            System.out.println("8. Devolução de cliente empresa");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente pessoa: ");
                    String nomePessoa = scanner.next();
                    System.out.print("Digite o CPF do cliente pessoa: ");
                    String cpf = scanner.next();
                    System.out.print("Digite o nome da cidade: ");
                    String nomeCidade = scanner.next();
                    System.out.print("Digite a UF da cidade: ");
                    String UF = scanner.next();
                    Cidade cidade = new Cidade(nomeCidade, UF);
                    System.out.print("Digite a rua: ");
                    String rua = scanner.next();
                    System.out.print("Digite o número: ");
                    int numero = scanner.nextInt();
                    System.out.print("Digite o bairro: ");
                    String bairro = scanner.next();
                    System.out.print("Digite o cep: ");
                    String cep = scanner.next();
                    Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
                    cliente = new ClientePessoa(nomePessoa, cpf, endereco);
                    break;
                case 2:
                    System.out.print("Digite o nome do cliente empresa: ");
                    String nomeEmpresa = scanner.next();
                    System.out.print("Digite o CNPJ do cliente empresa: ");
                    String cnpj = scanner.next();
                    System.out.print("Digite o nome da cidade: ");
                    nomeCidade = scanner.next();
                    System.out.print("Digite a UF da cidade: ");
                    UF = scanner.next();
                    cidade = new Cidade(nomeCidade, UF);
                    System.out.print("Digite a rua: ");
                    rua = scanner.next();
                    System.out.print("Digite o número: ");
                    numero = scanner.nextInt();
                    System.out.print("Digite o bairro: ");
                    bairro = scanner.next();
                    System.out.print("Digite o cep: ");
                    cep = scanner.next();
                    endereco = new Endereco(rua, numero, bairro, cep, cidade);
                    cliente = new ClienteEmpresa(nomeEmpresa, cnpj, endereco);
                    break;
                case 3:
                    if (cliente instanceof ClientePessoa) {
                        mostrarDadosCliente((ClientePessoa) cliente);
                    } else {
                        System.out.println("Nenhum cliente pessoa cadastrado.");
                    }
                    break;
                case 4:
                    if (cliente instanceof ClienteEmpresa) {
                        mostrarDadosCliente((ClienteEmpresa) cliente);
                    } else {
                        System.out.println("Nenhum cliente empresa cadastrado.");
                    }
                    break;
                case 5:
                    if (cliente instanceof ClientePessoa) {
                        System.out.print("Digite o valor do empréstimo: ");
                        double valorEmprestimoPessoa = scanner.nextDouble();
                        ((ClientePessoa) cliente).emprestar(valorEmprestimoPessoa);
                    } else {
                        System.out.println("Nenhum cliente pessoa cadastrado.");
                    }
                    break;
                case 6:
                    if (cliente instanceof ClienteEmpresa) {
                        System.out.print("Digite o valor do empréstimo: ");
                        double valorEmprestimoEmpresa = scanner.nextDouble();
                        ((ClienteEmpresa) cliente).emprestar(valorEmprestimoEmpresa);
                    } else {
                        System.out.println("Nenhum cliente empresa cadastrado.");
                    }
                    break;
                case 7:
                    if (cliente instanceof ClientePessoa) {
                        System.out.print("Digite o valor da devolução: ");
                        double valorDevolucaoPessoa = scanner.nextDouble();
                        ((ClientePessoa) cliente).devolver(valorDevolucaoPessoa);
                    } else {
                        System.out.println("Nenhum cliente pessoa cadastrado.");
                    }
                    break;
                case 8:
                    if (cliente instanceof ClienteEmpresa) {
                        System.out.print("Digite o valor da devolução: ");
                        double valorDevolucaoEmpresa = scanner.nextDouble();
                        ((ClienteEmpresa) cliente).devolver(valorDevolucaoEmpresa);
                    } else {
                        System.out.println("Nenhum cliente empresa cadastrado.");
                    }
                    break;
                case 9:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 9);

        scanner.close();
    }

    private static void mostrarDadosCliente(ClientePessoa cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpfCnpj());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Valor emprestado: R$" + cliente.getVlrEmprestado());
    }

    private static void mostrarDadosCliente(ClienteEmpresa cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CNPJ: " + cliente.getCpfCnpj());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Valor emprestado: R$" + cliente.getVlrEmprestado());
    }
}
