package src.br.edu.up.Models;

import java.util.ArrayList;
import java.util.List;

public class AgendaModel {
    private List<Contato> contatos;

    public AgendaModel() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void excluirContato(int codigo) {
        contatos.removeIf(c -> c.getCodigo() == codigo);
    }

    public Contato consultarContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public List<Contato> listarContatos() {
        return contatos;
    }
}
