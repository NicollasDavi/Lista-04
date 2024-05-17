package br.edu.controller;

import view.*;

import br.edu.up.Models.SeguroModel;
import br.edu.up.Models.Seguro;
import br.edu.up.Models.SeguroVeiculo;
import br.edu.up.Models.SeguroVida;

public class SeguroController {
    private SeguroModel model;
    private SeguroView view;

    public SeguroController(SeguroModel model, SeguroView view) {
        this.model = model;
        this.view = view;
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();
            switch (opcao) {
                case 1:
                    Seguro novoSeguro = view.criarSeguro();
                    if (model.localizarSeguro(novoSeguro.getNumeroApolice()) == null) {
                        model.adicionarSeguro(novoSeguro);
                        view.exibirMensagem("Seguro adicionado com sucesso.");
                    } else {
                        view.exibirMensagem("Número de apólice já existe.");
                    }
                    break;
                case 2:
                    String numeroApolice = view.solicitarNumeroApolice();
                    Seguro seguro = model.localizarSeguro(numeroApolice);
                    view.exibirSeguro(seguro);
                    break;
                case 3:
                    numeroApolice = view.solicitarNumeroApolice();
                    model.excluirSeguro(numeroApolice);
                    view.exibirMensagem("Seguro excluído com sucesso.");
                    break;
                case 4:
                    view.confirmarExclusao();
                    if (view.exibirMenu() == 's') {
                        model.excluirTodosSeguros();
                        view.exibirMensagem("Todos os seguros foram excluídos.");
                    }
                    break;
                case 5:
                    for (Seguro s : model.listarTodosSeguros()) {
                        view.exibirSeguro(s);
                    }
                    break;
                case 6:
                    view.exibirMensagem("Quantidade de seguros: " + model.quantidadeSeguros());
                    break;
                case 7:
                    view.exibirMensagem("Programa encerrado.");
                    break;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }
}