package br.com.digitalhouse.Exercicio05;

public class Quadrado extends Quadrilateros{

    private double tamanhoLado;

    public Quadrado() {
    }

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    @Override
    public double calcularPerimetro() {

        double perimetroQuadrado = 0;

        perimetroQuadrado = getTamanhoLado() * 4;

        return perimetroQuadrado;
    }

    @Override
    public double calcularArea() {

        double areaQuadrado = 0;

        int expoente = 2;

        areaQuadrado = Math.pow(getTamanhoLado(),expoente);

        return areaQuadrado;
    }
}
