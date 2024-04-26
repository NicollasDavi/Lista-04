package Cenario02;

import Cenario02.Models.Ponto;

public class Programa {
    public static void main(String[] args) {
        
        Ponto ponto1 = new Ponto();

        
        Ponto ponto2 = new Ponto(2, 5);

        // Calcule distância do ponto1 ao ponto2
        double distanciaPonto1Ponto2 = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância do ponto1 ao ponto2: " + distanciaPonto1Ponto2);

        //  CALCULO DA DISTANCIA
        double distanciaPonto2Coordenadas = ponto2.calcularDistancia(7, 2);
        System.out.println("Distância do ponto2 às coordenadas (7, 2): " + distanciaPonto2Coordenadas);

        // Alterando o valor de x para 10 nU PONYO1
        ponto1.setX(10);
        System.out.println("Novo valor de x no ponto1: " + ponto1.getX());

        // Alterando o valor de y para 3 no ponto1
        ponto1.setY(3);
        System.out.println("Novo valor de y no ponto1: " + ponto1.getY());
    }
}
