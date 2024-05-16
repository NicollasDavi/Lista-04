package src.br.edu.up;
import java.util.List;
import java.util.Scanner;
import src.br.edu.up.Models.*;

public class Programa {
    public static void main(String[] args) {
        AgendaModel model = new AgendaModel();
        AgendaView view = new AgendaView();
        AgendaController controller = new AgendaController(model, view);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            view.mostrarMenu();
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = scanner.next();
                    System.out.println("Digite o telefone:");
                    String telefone = scanner.next();
                    System.out.println("Digite o endereço:");
                    String endereco = scanner.next();
                    controller.adicionarContatoPessoal(nome, telefone, endereco);
                    break;
                case 2:
                    System.out.println("Digite o nome:");
                    nome = scanner.next();
                    System.out.println("Digite o telefone:");
                    telefone = scanner.next();
                    System.out.println("Digite a empresa:");
                    String empresa = scanner.next();
                    controller.adicionarContatoComercial(nome, telefone, empresa);
                    break;
                case 3:
                    System.out.println("Digite o código do contato a ser excluído:");
                    int codigo = scanner.nextInt();
                    controller.excluirContato(codigo);
                    break;
                case 4:
                    System.out.println("Digite o código do contato a ser consultado:");
                    codigo = scanner.nextInt();
                    Contato contato = controller.consultarContato(codigo);
                    if (contato != null) {
                        System.out.println("Nome: " + contato.getNome());
                        System.out.println("Telefone: " + contato.getTelefone());
                        if (contato instanceof ContatoPessoal) {
                            ContatoPessoal pessoal = (ContatoPessoal) contato;
                            System.out.println("Endereço: " + pessoal.getEndereco());
                        } else if (contato instanceof ContatoComercial) {
                            ContatoComercial comercial = (ContatoComercial) contato;
                            System.out.println("Empresa: " + comercial.getEmpresa());
                        }
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 5:
                    List<Contato> contatos = controller.listarContatos();
                    for (Contato c : contatos) {
                        System.out.println("Nome: " + c.getNome());
                        System.out.println("Telefone: " + c.getTelefone());
                        if (c instanceof ContatoPessoal) {
                            ContatoPessoal pessoal = (ContatoPessoal) c;
                            System.out.println("Endereço: " + pessoal.getEndereco());
                        } else if (c instanceof ContatoComercial) {
                            ContatoComercial comercial = (ContatoComercial) c;
                            System.out.println("Empresa: " + comercial.getEmpresa());
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }
}