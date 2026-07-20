package Solucoes.Vetores;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int vet[] = new int[8];
            int multiplicacao = 1;

            for (int i = 0; i < vet.length; i++) {
                vet[i] = scanner.nextInt();
            }

            for (int i = 0; i < vet.length; i++) {
                multiplicacao *= vet[i];
            }

            System.out.println("A multiplicação de todos os elementos é: " + multiplicacao);
        }
    }
}
