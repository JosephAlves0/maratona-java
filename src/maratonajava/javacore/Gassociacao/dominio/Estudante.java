package maratonajava.javacore.Gassociacao.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Seminário: " + seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

}
