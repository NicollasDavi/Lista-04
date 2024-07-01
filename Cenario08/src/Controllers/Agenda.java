package Controllers;
import java.util.ArrayList;
import java.util.List;

import Models.*;
import Views.*;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public void excluirContato(int codigo) {
        Contato contato = getContato(codigo);
        if (contato != null) {
            contatos.remove(contato);
        }
    }

    public List<Contato> getContatos() {
        return contatos;
    }
}
