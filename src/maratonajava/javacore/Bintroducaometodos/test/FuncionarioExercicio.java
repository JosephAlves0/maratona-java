package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();

        funcionario1.nome = "Ciclado";
        funcionario1.idade = 18;
        funcionario1.salario = 2000;

        funcionario2.nome = "Fulano";
        funcionario2.idade = 19;
        funcionario2.salario = 3000;

        funcionario3.nome = "Beltrano";
        funcionario3.idade = 22;
        funcionario3.salario = 4000;

        funcionario1.imprimirDados();
        funcionario2.imprimirDados();
        funcionario3.imprimirDados();

        Funcionario.mediaSalarios(funcionario1.salario, funcionario2.salario, funcionario3.salario);
    }
}
