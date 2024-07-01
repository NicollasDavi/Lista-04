package br.edu.up.views;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        System.out.println("Menu Principal");
        System.out.println("1. Registrar Passageiro");
        System.out.println("2. Registrar Tripulação");
        System.out.println("3. Exibir Informações");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public int lerOpcao() {
        return scanner.nextInt();
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public int lerInt(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public LocalDateTime lerDataHora(String mensagem) {
        System.out.print(mensagem);
        String dataHora = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(dataHora, formatter);
    }
}