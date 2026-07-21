package Solucoes.Vetores;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vet1 = new int[8];
            int[] vet2 = new int[vet1.length];
            int[] vet3 = new int[vet1.length];

            for (int i = 0; i < vet1.length; i++) {
                System.out.printf("Vetor 1 [%d]: ", i);
                vet1[i] = scanner.nextInt();

                System.out.printf("Vetor 2 [%d]: ", i);
                vet2[i] = scanner.nextInt();
            }

            for (int i = 0; i < vet3.length; i++) {
                vet3[i] = vet1[i] + vet2[i];

                System.out.print(vet3[i] + " ");
            }
            System.out.println();
        }
    }
}
