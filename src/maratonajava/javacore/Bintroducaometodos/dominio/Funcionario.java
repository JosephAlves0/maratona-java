package maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public static void mediaSalarios(double... salarios ){
        double soma = 0;
        int quantidade = salarios.length;
        for(double salario : salarios){
            soma += salario;
        }
        System.out.println("Média dos salários " + (soma/quantidade));
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome + " - idade " + idade + " - salario: " + salario );
    }
}
