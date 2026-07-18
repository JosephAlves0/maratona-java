package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1.000.000
        int count = 0;
        while (count < 1000000) {
            if(count % 2 == 0) {
                System.out.println("While - Números pares " + count);
            }
            count++;
        }
        count = 0;
        do {
            if(count % 2 == 0) {
                System.out.println("Do While - Números pares " + count);
            }
            count++;
        } while (count <= 1000000);

        for(int i = 0; i <= 1000000; i ++) {
            if(i % 2 == 0) {
                System.out.println("For - Números pares " + i);
            }
        }
    }
}
