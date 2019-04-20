package br.com.digitalhouse.Exercicio05;

public class Retangulo extends Quadrilateros {

    private double tamanhoBase;
    private double tamanhoAltura;

    public Retangulo() {
    }

    public Retangulo(double tamanhoBase, double tamanhoAltura) {
        this.tamanhoBase = tamanhoBase;
        this.tamanhoAltura = tamanhoAltura;
    }

    public double getTamanhoBase() {
        return tamanhoBase;
    }

    public void setTamanhoBase(double tamanhoBase) {
        this.tamanhoBase = tamanhoBase;
    }

    public double getTamanhoAltura() {
        return tamanhoAltura;
    }

    public void setTamanhoAltura(double tamanhoAltura) {
        this.tamanhoAltura = tamanhoAltura;
    }

    @Override
    public double calcularPerimetro() {

        double perimetroRetangulo = 0;

        perimetroRetangulo = (getTamanhoBase() + getTamanhoAltura()) * 2;

        return perimetroRetangulo;
    }

    @Override
    public double calcularArea() {

        double areaRetangulo = 0;

        areaRetangulo = getTamanhoBase() * getTamanhoAltura();

        return areaRetangulo;
    }
}
