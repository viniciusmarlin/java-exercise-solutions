package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("Escreva o primeiro numero: ");
        int numeroUm = scanner.nextInt();

        System.out.print("Escreva o segundo numero: ");
        int numeroDois = scanner.nextInt();
        int maior = 0, menor = 0;

        // Lógica condicional
        if (numeroUm > numeroDois) {
            maior = numeroUm;
            menor = numeroDois;
        } else {
            maior = numeroDois;
            menor = numeroUm;
        }

        // Output
        System.out.println("Maior: " + maior + ". Menor: " + menor);

        scanner.close();
    }
}
