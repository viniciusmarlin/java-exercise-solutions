package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Escreva o primeiro número: ");
            int a = scanner.nextInt();

            System.out.print("Escreva o segundo número: ");
            int b = scanner.nextInt();

            // Output & Lógica
            System.out.printf("Soma: %d%n", (a + b));
        }
    }
}
