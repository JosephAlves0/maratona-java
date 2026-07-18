package maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        for(Seminario seminario : this.seminario){
            System.out.println("Seminários ministrados: " + seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
