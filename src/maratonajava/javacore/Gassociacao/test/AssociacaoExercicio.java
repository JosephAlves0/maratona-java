package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Estudante;
import maratonajava.javacore.Gassociacao.dominio.Local;
import maratonajava.javacore.Gassociacao.dominio.Professor;
import maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoExercicio {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("João", 25);
        Estudante estudante2 = new Estudante("Maria", 23);
        Estudante estudante3 = new Estudante("Pedro", 22);
        Professor professor1 = new Professor("Jobs", "POO");
        Professor professor2 = new Professor("Torvalds", "Linux");
        Seminario seminario1 = new Seminario("Java");
        Seminario seminario2 = new Seminario("Python");
        Local local1 = new Local("Rua Batista, 0 - São Paulo/SP");
        Local local2 = new Local("Av Santos, 100 - Salvador/BA");

        estudante1.setSeminario(seminario1);
        estudante2.setSeminario(seminario1);
        estudante3.setSeminario(seminario2);

        Estudante[] estudantesSeminario1 = {estudante1, estudante2};
        Estudante[] estudantesSeminario2 = {estudante3};
        Seminario[] seminariosProfessor1 = {seminario1};
        Seminario[] seminariosProfessor2 = {seminario1, seminario2};

        seminario1.setEstudantes(estudantesSeminario1);
        seminario1.setLocal(local1);
        seminario2.setEstudantes(estudantesSeminario2);
        seminario2.setLocal(local2);

        professor1.setSeminario(seminariosProfessor1);
        professor2.setSeminario(seminariosProfessor2);

        System.out.println("--- Estudantes ---");
        estudante1.imprimir();
        estudante2.imprimir();
        estudante3.imprimir();

        System.out.println("--- Seminarios ---");
        seminario1.imprimir();
        seminario2.imprimir();

        System.out.println("--- Professores ---");
        professor1.imprimir();
        professor2.imprimir();

    }
}