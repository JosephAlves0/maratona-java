package maratonajava.introducao;

public class Aula04EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 50000;
        double impostoPrimeiraFaixa = 0.097;
        double impostoSegundaFaixa = 0.3735;
        double impostoTerceiraFaixa = 0.4950;
        double imposto;

        if (salario <= 34712) {
            imposto = salario * impostoPrimeiraFaixa;
        } else if (salario <= 68507) {
            imposto = salario * impostoSegundaFaixa;
        } else {
            imposto = salario * impostoTerceiraFaixa;
        }

        System.out.println("Valor do imposto " + imposto);
    }
}
