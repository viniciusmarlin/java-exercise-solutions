package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            int numero = scanner.nextInt();

            //Output & Lógica
            for (int i = 0; i <= 10; i++) {
                System.out.printf("Resultado: %d%n", (numero * i));
            }

        }
    }
}
