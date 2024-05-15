package br.edu.up.models;

import java.util.List;

public class Comissario extends Tripulação  {
    

        private List<String> idiomasFluencia;

        public Comissario(String nome, String rg, String idAeronautica, String matriculaFuncionario, List<String> idiomasFluencia) {
            super(nome, rg, idAeronautica, matriculaFuncionario);
            this.idiomasFluencia = idiomasFluencia;
        }

    
}
