package br.com.digitalhouse.Exercicio05;

public abstract class Quadrilateros implements FormaGeometrica {

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;

    public Quadrilateros() {
    }

    public Quadrilateros(double ladoA, double ladoB, double ladoC, double ladoD) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
