import java.util.ArrayList;
import java.util.List;

public class EventoController {
    private List<Evento> eventos;

    public EventoController() {
        eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> listarEventos() {
        return eventos;
    }
}