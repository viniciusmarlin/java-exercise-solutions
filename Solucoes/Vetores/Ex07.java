package Solucoes.Vetores;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] vet = new int[20];
            int[] vet2 = new int[vet.length];
            int tamanhoVet2 = 0; 

            
            for (int i = 0; i < vet.length; i++) {
                vet[i] = scanner.nextInt();

                while (vet[i] < 0) {
                    System.out.println("Escreva um numero maior ou igual a 0:");
                    vet[i] = scanner.nextInt();
                }
            }

           
            for (int i = 0; i < vet.length; i++) {
                boolean jaExiste = false;

              
                for (int j = 0; j < tamanhoVet2; j++) {
                    if (vet[i] == vet2[j]) {
                        jaExiste = true;
                        break; 
                    }
                }

                
                if (!jaExiste) {
                    vet2[tamanhoVet2] = vet[i];
                    tamanhoVet2++; 
                }
            }

            
            System.out.println("\n--- Primeira sequência (Original) ---");
            for (int i = 0; i < vet.length; i++) {
                System.out.print(vet[i] + " ");
            }

            System.out.println("\n\n--- Segunda sequência (Sem repetições) ---");
            for (int i = 0; i < tamanhoVet2; i++) {
                System.out.print(vet2[i] + " ");
            }
            System.out.println();
        }
    }
}