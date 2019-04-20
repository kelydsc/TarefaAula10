package br.com.digitalhouse.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //cria empresa
        Empresa empresa = new Empresa("Digital House", "26.226.155/0001-34");

        //cria departamentos
        Departamento compras = new Departamento("Compras");
        Departamento financeiro = new Departamento("Financeiro");
        Departamento rh = new Departamento("RH");

        //cria funcionarios
        Funcionario kely = new Funcionario("Kely",5000.00d,"01/05/2015");
        Funcionario paula = new Funcionario("Paula",4000.00d,"10/06/2016");
        Funcionario fernando = new Funcionario("Fernando",4500.00d,"20/07/2017");
        Funcionario claudio = new Funcionario("Claudio",3000.00d,"30/08/2018");

        //registras departamentos da empresa
        empresa.registrarDepartamentos(compras);
        empresa.registrarDepartamentos(financeiro);
        empresa.registrarDepartamentos(rh);

        //mostrar lista de departamentos da empresa
        empresa.imprimeListaDepartamento();

        System.out.println("-------------------------------------------------------------------------------");

        empresa.getDepartamento("Compras").registraFuncionario(kely);
        empresa.getDepartamento("Compras").registraFuncionario(fernando);
        empresa.getDepartamento("Financeiro").registraFuncionario(paula);
        empresa.getDepartamento("RH").registraFuncionario(claudio);

        //calcula salario dos funcionarios
        empresa.getDepartamento("Compras").calcularAumentoSalario();

        //mostrar lista de funcionários do departamento
        empresa.getDepartamento("Compras").imprimeListaDepartamento();
        empresa.getDepartamento("Financeiro").imprimeListaDepartamento();
        empresa.getDepartamento("RH").imprimeListaDepartamento();

        //remove funcionario do departamento
        empresa.getDepartamento("Compras").transferirFuncionarioDeDepartamento(fernando);

        //adiciona funcionario no departamento
        empresa.getDepartamento("Financeiro").registraFuncionario(fernando);

        empresa.getDepartamento("Compras").imprimeListaDepartamento();
        empresa.getDepartamento("Financeiro").imprimeListaDepartamento();

    }

}
