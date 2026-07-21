package Solucoes.Vetores;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int[] vet = new int[4];
            int menor = vet[0], maior = vet[0];

            for (int i = 0; i < vet.length; i++) {
                vet[i] = scanner.nextInt();
            }

            for (int i = 0; i < vet.length; i++) {
                if (maior < vet[i])
                    maior = vet[i];

                if (menor > vet[i])
                    menor = vet[i];
            }

            System.out.printf("Menor: %d Maior: %d", menor, maior);
        }
    }
}
