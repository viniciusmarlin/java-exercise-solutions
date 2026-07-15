package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            int menor = Integer.MAX_VALUE;
            int numero;

            // Output & Lógica
            do {
                numero = scanner.nextInt();

                if (numero == 0) {
                    if (menor == Integer.MAX_VALUE) {
                        System.out.println("O usuario não digitou nenhum numero");
                        break;
                    } else {
                        System.out.print("O menor numero do conjunto dado foi: " + menor);
                        break;
                    }
                }

                if (numero < menor) {
                    menor = numero;
                }

            } while (true);
        }
    }
}
