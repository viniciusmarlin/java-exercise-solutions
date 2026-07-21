package Solucoes.Vetores;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vet = new int[10];

            for (int i = 0; i < vet.length; i++) {
                System.out.printf("Vetor [%d]: ", i);
                vet[i] = scanner.nextInt();
            }

            System.out.println("Indice dos elementos impares: ");

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] % 2 != 0)
                    System.out.print(i + " ");
            }
        }
    }
}
