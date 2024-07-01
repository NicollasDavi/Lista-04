package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.*;


public class SeguroController {
    private List<Seguro> seguros;

    public SeguroController() {
        this.seguros = new ArrayList<>();
    }

    public void incluirSeguro(Seguro seguro) {
        for (Seguro s : seguros) {
            if (s.getApolice().equals(seguro.getApolice())) {
                System.out.println("Número de apólice já existe.");
                return;
            }
        }
        seguros.add(seguro);
        System.out.println("Seguro incluído com sucesso.");
    }

    public Seguro localizarSeguro(String apolice) {
        for (Seguro s : seguros) {
            if (s.getApolice().equals(apolice)) {
                return s;
            }
        }
        return null;
    }

    public void excluirSeguro(String apolice) {
        Seguro seguro = localizarSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            System.out.println("Seguro removido com sucesso.");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    public void excluirTodosSeguros() {
        seguros.clear();
        System.out.println("Todos os seguros foram removidos.");
    }

    public void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            System.out.println("Não há seguros cadastrados.");
        } else {
            for (Seguro s : seguros) {
                System.out.println(s.getDados());
            }
        }
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }
}
