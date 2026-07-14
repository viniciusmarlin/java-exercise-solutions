package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Escreva o primeiro numero: ");
            int numeroUm = scanner.nextInt();

            System.out.print("Escreva o segundo numero: ");
            int numeroDois = scanner.nextInt();

            // Lógica condicional
            if (numeroUm < numeroDois) {
                System.out.printf("%d %d%n", numeroUm, numeroDois);
            } else {
                System.out.printf("%d %d%n", numeroDois, numeroUm);
            }

        }
    }
}
