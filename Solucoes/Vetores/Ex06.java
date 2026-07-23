package Solucoes.Vetores;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean achado = false;
            
            int[] vet = new int[10];
            
            System.out.print("Valor a ser encontrado: ");
            int N = scanner.nextInt(), pos = 0;

            for (int i = 0; i < vet.length; i++) {
                System.out.print("Vetor: ");
                vet[i] = scanner.nextInt();
            }

            for (int i = 0; i < vet.length; i++) {
                if (vet[i] == N) {
                    achado = true;
                    pos = i;
                    break;
                }
            }

            if (achado == true)
                System.out.print("Posição do numero encontrado: " + pos);
            else
                System.out.println("Não foi encontrado o numero no vetor");

        }
    }
}
