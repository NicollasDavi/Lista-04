package src.br.edu.up.Models;
import java.util.List;

public class AgendaController {
    private AgendaModel model;
    private AgendaView view;

    public AgendaController(AgendaModel model, AgendaView view) {
        this.model = model;
        this.view = view;
    }

    
    public void adicionarContatoPessoal(String nome, String telefone, String endereco) {
        ContatoPessoal contato = new ContatoPessoal(nome, telefone, endereco);
        model.adicionarContato(contato);
    }

    public void adicionarContatoComercial(String nome, String telefone, String empresa) {
        ContatoComercial contato = new ContatoComercial(nome, telefone, empresa);
        model.adicionarContato(contato);
    }

    public void excluirContato(int codigo) {
        model.excluirContato(codigo);
    }

    public Contato consultarContato(int codigo) {
        return model.consultarContato(codigo);
    }

    public List<Contato> listarContatos() {
        return model.listarContatos();
    }
}

