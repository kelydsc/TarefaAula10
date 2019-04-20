package br.com.digitalhouse.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private String cnpj;
    private List<Departamento> listaDepartamento = new ArrayList<>();

    public Empresa() {
    }

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Departamento> getListaDepartamento() {
        return listaDepartamento;
    }

    public void setListaDepartamento(List<Departamento> listaDepartamento) {
        this.listaDepartamento = listaDepartamento;
    }

    public void registrarDepartamentos(Departamento departamento){

        listaDepartamento.add(departamento);

    }

    public Departamento getDepartamento(String nomeDepartamento){

        for (Departamento linha :  listaDepartamento){

            if(linha.getNome().equals(nomeDepartamento) ){

                return linha;
            }
        }
        return null;
    }

    public void imprimeListaDepartamento(){

        System.out.println("Empresa: " + getNome() + " - " +
                           "CNPJ: " + getCnpj());

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Departamentos: ");

        for (int posicao = 0;posicao < listaDepartamento.size();posicao++){

            System.out.println(getListaDepartamento().get(posicao).getNome());
        }

    }
}
