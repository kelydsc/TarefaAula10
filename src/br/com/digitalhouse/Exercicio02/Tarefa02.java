package br.com.digitalhouse.Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Tarefa02 {

    public void imprimePessoa(String[] arrayNome, int[] arrayIdade){

            //retorna o nome e idade da pessoa mais Velha
            if(arrayIdade[0] > arrayIdade[1] && arrayIdade[0] > arrayIdade[2]){

                System.out.println("Nome da pessoas mais velha: " + arrayNome[0] + "\nIdade: " + arrayIdade[0]);

            }else if(arrayIdade[1] > arrayIdade[0] && arrayIdade[1] > arrayIdade[2]){

                System.out.println("Nome da pessoas mais velha: " + arrayNome[1] + "\nIdade: " + arrayIdade[1]);

            }else {

                System.out.println("Nome da pessoas mais velha: " + arrayNome[2] + "\nIdade: " + arrayIdade[2]);
            }


            //retorna o nome e idade da pessoa mais Nova
            if(arrayIdade[0] < arrayIdade[1] && arrayIdade[0] < arrayIdade[2]){

                System.out.println("Nome da pessoas mais nova: " + arrayNome[0] + "\nIdade: " + arrayIdade[0]);

            }else if(arrayIdade[1] < arrayIdade[0] && arrayIdade[1] < arrayIdade[2]){

                System.out.println("Nome da pessoas mais nova: " + arrayNome[1] + "\nIdade: " + arrayIdade[1]);

            }else {
                System.out.println("Nome da pessoas mais nova: " + arrayNome[2] + "\nIdade: " + arrayIdade[2]);
            }

    }

    public static void main(String[] args) {

        String[] arrayNome = {"Ana", "Fernanda", "Caio"};

        int[] arrayIdade = {90,30,100};

        Tarefa02 pessoa = new Tarefa02();

        pessoa.imprimePessoa(arrayNome,arrayIdade);
    }
}
