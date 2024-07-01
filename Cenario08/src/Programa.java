
import Views.*;
import Models.*;
import Controllers.*;

import java.util.List;

public class Programa {
    private static Agenda agenda = new Agenda();
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = menu.mostrarMenu();

            switch (opcao) {
                case 1:
                    Pessoal pessoal = menu.lerContatoPessoal();
                    agenda.adicionar(pessoal);
                    menu.mostrarMensagem("Contato pessoal adicionado com sucesso!");
                    break;
                case 2:
                    Comercial comercial = menu.lerContatoComercial();
                    agenda.adicionar(comercial);
                    menu.mostrarMensagem("Contato comercial adicionado com sucesso!");
                    break;
                case 3:
                    int codigoExcluir = menu.lerCodigoContato();
                    agenda.excluirContato(codigoExcluir);
                    menu.mostrarMensagem("Contato excluído com sucesso!");
                    break;
                case 4:
                    int codigoConsultar = menu.lerCodigoContato();
                    Contato contato = agenda.getContato(codigoConsultar);
                    menu.mostrarContato(contato);
                    break;
                case 5:
                    List<Contato> contatos = agenda.getContatos();
                    menu.listarContatos(contatos);
                    break;
                case 6:
                    menu.mostrarMensagem("Saindo...");
                    break;
                default:
                    menu.mostrarMensagem("Opção inválida!");
            }
        } while (opcao != 6);
    }
}
