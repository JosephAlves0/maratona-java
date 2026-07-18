package maratonajava.introducao;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        // Exercício de Swtich
        // Dado os valores de 1 a 7, imprima se é dia útil ou fds
        // Considerando 1 como domingo
        byte diaNumero = 5;

        switch (diaNumero) {
            case 1 -> System.out.println("fds");
            case 2 -> System.out.println("dia útil");
            case 3 -> System.out.println("dia útil");
            case 4 -> System.out.println("dia útil");
            case 5 -> System.out.println("dia útil");
            case 6 -> System.out.println("dia útil");
            case 7 -> System.out.println("fds");
            default -> System.out.println("Valor inválido");
        }
    }
}
