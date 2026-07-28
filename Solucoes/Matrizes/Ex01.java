package Solucoes.Matrizes;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            int[][] matA = new int[3][2];
            int[][] matB = new int[matA.length][matA[0].length];
            int[][] matC = new int[matA.length][matA[0].length];

            for (int i = 0; i < matA.length; i++) {
                for (int j = 0; j < matA[i].length; j++) {
                    System.out.print("Digite o valor de matA: ");
                    matA[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matB.length; i++) { 
                for (int j = 0; j < matB[i].length; j++) { 
                    System.out.print("Digite o valor de matB: ");
                    matB[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matC.length; i++) {
                for (int j = 0; j < matC[i].length; j++) {
                    matC[i][j] = matA[i][j] + matB[i][j];
                }
            }

            for (int i = 0; i < matC.length; i++) {
                for (int j = 0; j < matC[i].length; j++) {
                    System.out.print(matC[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
