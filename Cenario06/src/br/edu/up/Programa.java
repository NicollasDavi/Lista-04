package br.edu.up;

import br.edu.up.controllers.Controlador;

public class Programa {
    public static void main(String[] args) throws Exception {
        Controlador controlador = new Controlador();
        controlador.iniciar();
    }
}
