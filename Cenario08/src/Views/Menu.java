package Views;

import java.util.List;
import java.util.Scanner;

import Models.*;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Pessoal lerContatoPessoal() {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = scanner.nextLine();

        return new Pessoal(codigo, nome, telefone, aniversario);
    }

    public Comercial lerContatoComercial() {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        return new Comercial(codigo, nome, telefone, cnpj);
    }

    public int lerCodigoContato() {
        System.out.print("Código do contato: ");
        return scanner.nextInt();
    }

    public void mostrarContato(Contato contato) {
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void listarContatos(List<Contato> contatos) {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
