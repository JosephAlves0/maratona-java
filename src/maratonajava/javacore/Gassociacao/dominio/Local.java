package maratonajava.javacore.Gassociacao.dominio;

public class Local {
    private String endereco;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir() {
        System.out.println("Endereço: " + this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
