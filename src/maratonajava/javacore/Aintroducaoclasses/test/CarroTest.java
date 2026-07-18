package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Ferrari";
        carro1.modelo = "Spider";
        carro1.ano = 2020;

        System.out.println("Nome: " + carro1.nome + " " + "Modelo: " + carro1.modelo + " " + "Ano: " + carro1.ano);
        System.out.println("-------------------------------------");

        Carro carro2 = new Carro();
        carro2.nome = "McLaren";
        carro2.modelo = "Senna";
        carro2.ano = 2022;

        System.out.println("Nome: " + carro2.nome + " " + "Modelo: " + carro2.modelo + " " + "Ano: " + carro2.ano);
    }
}
