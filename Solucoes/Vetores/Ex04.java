package Solucoes.Vetores;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vet1 = new int[2];
            int[] vet2 = new int[vet1.length];
            int[] vet3 = new int[vet1.length * 2];

            for (int i = 0; i < vet1.length; i++) {
                System.out.printf("Vetor 1: [%d]", i);
                vet1[i] = scanner.nextInt();

                if (i > 0) {
                    while (vet1[i] < vet1[i - 1]) {
                        System.out.print("Escreva um vetor 1 maior do que o anterior: ");
                        vet1[i] = scanner.nextInt();
                    }
                }

                System.out.printf("Vetor 2: [%d]", i);
                vet2[i] = scanner.nextInt();

                if (i > 0) {
                    while (vet2[i] < vet2[i - 1]) {
                        System.out.print("Escreva um vetor 2 maior do que o anterior: ");
                        vet2[i] = scanner.nextInt();
                    }
                }
            }

            for (int i = 0; i < vet1.length; i++) {
                vet3[i * 2] = vet1[i];

                // Na posição ÍMPAR de vet3 (1, 3, 5, 7...), entra o elemento atual de vet2
                vet3[i * 2 + 1] = vet2[i];

                // Para mostrar na tela bonito, imprimimos os dois que acabaram de ser inseridos
                System.out.print(vet3[i * 2] + " " + vet3[i * 2 + 1] + " ");
            }
        }
    }
}
