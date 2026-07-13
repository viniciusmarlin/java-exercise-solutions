package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs
        int numeroUm = scanner.nextInt();
        int numeroDois = scanner.nextInt();
        int numeroTres = scanner.nextInt();

        // Lógica condicional
        if (numeroUm > numeroDois && numeroUm > numeroTres) {
            System.out.println("O maior numero é o: " + numeroUm);
        } else if (numeroDois > numeroTres) {
            System.out.println("O maior numero é o: " + numeroDois);
        } else {
            System.out.println("O maior numero é o: " + numeroTres);
        }

        scanner.close();
    }
}
