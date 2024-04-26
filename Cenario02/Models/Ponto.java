package Cenario02.Models;

public class Ponto {

    // Atributos
    private double x;
    private double y;

    // Construtor padrão (cria um ponto na origem (0, 0))
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    // Construtor que recebe as coordenadas x e y
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters e setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular a distância até outro ponto
    public double calcularDistancia(Ponto outroPonto) {
        double deltaX = this.x - outroPonto.getX();
        double deltaY = this.y - outroPonto.getY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Método para calcular a distância até coordenadas específicas
    public double calcularDistancia(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}
