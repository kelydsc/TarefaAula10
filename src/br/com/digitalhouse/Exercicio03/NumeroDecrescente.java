package br.com.digitalhouse.Exercicio03;

public class NumeroDecrescente {

    public void imprimeOrdemDecrescente(int numero){

        for (int posicao = 0;posicao <= numero; posicao++){

            System.out.println("Numero: " + (numero - posicao));
        }
    }
}
