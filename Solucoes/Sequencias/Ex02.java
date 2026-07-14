package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Escreva o valor do primeiro posto: R$");
            double postoUm = scanner.nextDouble();

            System.out.print("Escreva o valor do segundo posto: R$");
            double postoDois = scanner.nextDouble();

            System.out.print("Escreva o valor do terceiro posto: R$");
            double postoTres = scanner.nextDouble();

            // Output & Lógica
            System.out.printf("Média: R$%.2f", (postoUm + postoDois + postoTres) / 3);
        }
    }
}
