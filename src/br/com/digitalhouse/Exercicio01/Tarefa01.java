package br.com.digitalhouse.Exercicio01;

public class Tarefa01 {

    int numeroAntecessor;
    int numeroSucessor;

    public void imprimeNumeroAntecessorSucessor(int numero){

        System.out.println("Numero: " + numero);

        numeroAntecessor = numero - 1;
        System.out.println("Numero antecessor: " + numeroAntecessor);

        numeroSucessor = numero + 1;
        System.out.println("Numero sucessor: " + numeroSucessor);

    }

    public static void main(String[] args) {

        Tarefa01 tarefa01 = new Tarefa01();
        tarefa01.imprimeNumeroAntecessorSucessor(2);
    }
}
