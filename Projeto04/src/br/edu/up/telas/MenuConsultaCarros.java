package br.edu.up.telas;

import br.edu.up.controles.*;
import br.edu.up.modelos.*;
import br.edu.up.Prompt;

public class MenuConsultaCarros {
    public void mostrar(){

        Prompt.separador();
        Prompt.imprimir("Menu Inicial");
        Prompt.separador();
        Prompt.imprimir("1. Registrar carro;");
        Prompt.imprimir("2.Gerar relatório de Turno;");
        Prompt.separador();
        int opcao = Prompt.lerInteiro("Digite a operação desejada: ");


        switch (opcao) {
            case 1:{
            registrarCarro();
                break;
            }

            case 2:{
            gerarRelatorio();
                break;
            }
        
            default:
                break;
        }


    }
    public void registrarCarro(){
        
        Carros carro = new Carros();
        carro.setModelo(Prompt.lerLinha("Digite o modelo do Carro: "));
        carro.setCor(Prompt.lerLinha("Digite a cor do Carro: "));
        carro.setPlaca(Prompt.lerLinha("Digite a Placa do Carro: "));
    }

    public void gerarRelatorio(){
        
    }
}

