package maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private Estudante[] estudantes;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprimir() {
        System.out.println("Seminário: " + this.titulo);
        for(Estudante estudante : estudantes) {
            System.out.println("Estudante: " + estudante.getNome());
        }
        System.out.println("Endereço: " + local.getEndereco());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
