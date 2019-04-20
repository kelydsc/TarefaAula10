package br.com.digitalhouse.Exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado01 = new Quadrado(20.00d);
        Quadrado quadrado02 = new Quadrado(40.00d);

        Retangulo retangulo01 = new Retangulo(20.00d,15.00d);
        Retangulo retangulo02 = new Retangulo(40.00d,35.00d);

        Circulo circulo01 = new Circulo(30.00d);
        Circulo circulo02 = new Circulo(50.00d);

        List<Quadrilateros> listaGeometrica = new ArrayList<>();

        listaGeometrica.add(quadrado01);
        listaGeometrica.add(quadrado02);

        listaGeometrica.add(retangulo01);
        listaGeometrica.add(retangulo02);

        listaGeometrica.add(circulo01);
        listaGeometrica.add(circulo02);

        System.out.println("Lista geometrica: ");

        System.out.println("---------------------------------");

        for (Quadrilateros linha : listaGeometrica){

            System.out.println("Perimetro: " + linha.calcularPerimetro() + "\r\n" +
                               "Area: " + linha.calcularArea());

            System.out.println("---------------------------------");
        }

    }
}
