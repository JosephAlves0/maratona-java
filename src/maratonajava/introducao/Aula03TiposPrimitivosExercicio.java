package maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Bento Fulano";
        String endereco = "Rua dos fulanos, 0, Jardim dos Ciclanos";
        float salario = 7500.0F;
        String data = "12/07/2026";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data);
    }
}
