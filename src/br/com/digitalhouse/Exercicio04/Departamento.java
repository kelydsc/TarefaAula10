package br.com.digitalhouse.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private String nome;
    private List<Funcionario> listaFuncionario = new ArrayList<>();

    public Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }

    public void registraFuncionario(Funcionario funcionario){

        listaFuncionario.add(funcionario);

    }

    public void calcularAumentoSalario(){

        for(Funcionario linha : listaFuncionario){

            linha.setSalario(linha.getSalario() * 1.10);

        }
    }

    public void transferirFuncionarioDeDepartamento(Funcionario funcionario){

        listaFuncionario.remove(funcionario);

    }

    public void imprimeListaDepartamento(){

        System.out.println("Lista de Funcionarios do Departamento: " + getNome());

        for (int posicao = 0;posicao < listaFuncionario.size();posicao++){

            System.out.println("Nome: " + listaFuncionario.get(posicao).getNome() +
                               "\nSalário: " + listaFuncionario.get(posicao).getSalario() +
                               "\nData de Admissão: " + listaFuncionario.get(posicao).getDataDeAdmissao());
            System.out.println("-------------------------------------------------------------------------------");
        }
    }
}
