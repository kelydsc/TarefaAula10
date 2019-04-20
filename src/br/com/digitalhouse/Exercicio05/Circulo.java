package br.com.digitalhouse.Exercicio05;

public class Circulo extends Quadrilateros{

    private double tamanhoRaio;

    public Circulo() {
    }

    public Circulo(double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public double getTamanhoRaio() {
        return tamanhoRaio;
    }

    public void setTamanhoRaio(double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }


    @Override
    public double calcularPerimetro() {

        double perimetroCirculo = 0;

        perimetroCirculo = (2 * 3.14d) * getTamanhoRaio();

        return perimetroCirculo;
    }

    @Override
    public double calcularArea() {

        double areaCirculo = 0;

        int expoente = 2;

        //calcula pi * raio ^ 2
        areaCirculo = 3.14d * Math.pow (getTamanhoRaio(), expoente);

        return areaCirculo;
    }
}
