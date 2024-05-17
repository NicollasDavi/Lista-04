package br.edu.up.Models;

import java.util.ArrayList;
import java.util.List;

public class SeguroModel {
    private List<Seguro> seguros;

    public SeguroModel() {
        this.seguros = new ArrayList<>();
    }

    public void adicionarSeguro(Seguro seguro) {
        seguros.add(seguro);
    }

    public Seguro localizarSeguro(String numeroApolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice().equals(numeroApolice)) {
                return seguro;
            }
        }
        return null;
    }

    public void excluirSeguro(String numeroApolice) {
        seguros.removeIf(seguro -> seguro.getNumeroApolice().equals(numeroApolice));
    }

    public void excluirTodosSeguros() {
        seguros.clear();
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }

    public List<Seguro> listarTodosSeguros() {
        return new ArrayList<>(seguros);
    }
}