package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Digite um numero: ");
            int numeroUm = scanner.nextInt();

            System.out.print("Digite um numero: ");
            int numeroDois = scanner.nextInt();

            System.out.print("Digite um numero: ");
            int numeroTres = scanner.nextInt();

            // Lógica condicional
            if (numeroUm >= numeroDois && numeroUm >= numeroTres) {
                System.out.println("O maior numero é o: " + numeroUm);
            } else if (numeroDois >= numeroTres) {
                System.out.println("O maior numero é o: " + numeroDois);
            } else {
                System.out.println("O maior numero é o: " + numeroTres);
            }
        }
    }
}
