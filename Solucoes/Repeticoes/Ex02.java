package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Escreva um numero A: ");
            int a = scanner.nextInt();

            System.out.print("Escreva um numero B: ");
            int b = scanner.nextInt();
            int soma = 0;

            // Condicional
            if (a > b) {
                System.out.println("Escreva um intervalo válido");
                return;
            }

            // Output & Lógica
            for (int i = a; i <= b; i++) {
                int resultado = (i % 2 != 0) ? (soma += i) : 0;
                if (resultado != 0) {
                    System.out.printf("Resultado: %d%n", resultado);
                }
            }
        }
    }
}
