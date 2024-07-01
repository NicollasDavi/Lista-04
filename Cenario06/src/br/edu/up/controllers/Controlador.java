package br.edu.up.controllers;

import br.edu.up.views.Menu;

import br.edu.up.models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Pessoa> pessoas;
    private Menu menu;

    public Controlador() {
        pessoas = new ArrayList<>();
        menu = new Menu();
    }

    public void iniciar() {
        while (true) {
            menu.exibirMenuPrincipal();
            int opcao = menu.lerOpcao();
            switch (opcao) {
                case 1:
                    registrarPassageiro();
                    break;
                case 2:
                    registrarTripulacao();
                    break;
                case 3:
                    exibirInformacoes();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void registrarPassageiro() {
        String nome = menu.lerString("Nome: ");
        String rg = menu.lerString("RG: ");
        String identificadorBagagem = menu.lerString("Identificador de Bagagem: ");
        Aeronave aeronave = criarAeronave();
        Passagem passagem = criarPassagem();

        Passageiro passageiro = new Passageiro(nome, rg, identificadorBagagem, passagem, aeronave);
        pessoas.add(passageiro);

        System.out.println("Passageiro registrado com sucesso!");
    }

    private void registrarTripulacao() {
        String nome = menu.lerString("Nome: ");
        String rg = menu.lerString("RG: ");
        String identificacaoAeronautica = menu.lerString("Identificação Aeronáutica: ");
        String matricula = menu.lerString("Matrícula: ");
        Aeronave aeronave = criarAeronave();
        System.out.println();

        System.out.println("1. Comandante");
        System.out.println("2. Comissário");
        int tipo = menu.lerInt("Tipo de Tripulação (1 para Comandante, 2 para Comissário): ");

        if (tipo == 1) {
            int totalHorasVoo = menu.lerInt("Total de Horas de Voo: ");
            Comandante comandante = new Comandante(nome, rg, identificacaoAeronautica, matricula, totalHorasVoo, aeronave);
            pessoas.add(comandante);
        } else if (tipo == 2) {
            List<String> idiomas = new ArrayList<>();
            while (true) {
                String idioma = menu.lerString("Idioma (digite 'sair' para finalizar): ");
                if (idioma.equalsIgnoreCase("sair")) break;
                idiomas.add(idioma);
            }
            Comissario comissario = new Comissario(nome, rg, aeronave, identificacaoAeronautica, matricula, idiomas);
            pessoas.add(comissario);
        }

        System.out.println("Tripulante registrado com sucesso!");
    }

    private Aeronave criarAeronave() {
        String codigo = menu.lerString("Código da Aeronave: ");
        String tipo = menu.lerString("Tipo da Aeronave: ");
        String qtdAssentos = menu.lerString("Quantidade de Assentos: ");

        return new Aeronave(codigo, tipo, qtdAssentos);
    }

    private Passagem criarPassagem() {
        String numAssento = menu.lerString("Número do Assento: ");
        String classeAssento = menu.lerString("Classe do Assento: ");
        LocalDateTime dataVoo = (LocalDateTime.now());
        return new Passagem(numAssento, classeAssento, dataVoo);
    }

    

    @Override
    public String toString() {
        return "Controlador [pessoas=" + pessoas + "]";
    }

    private void exibirInformacoes() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
    

