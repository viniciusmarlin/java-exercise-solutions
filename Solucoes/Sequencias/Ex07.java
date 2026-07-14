package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Instacia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            double velocidadeKmH = scanner.nextDouble();

            final double FATOR_CONVERSÃO = 3.6;

            // Output & Lógica
            System.out.printf("%.1fkm/h equivalem a %.1fm/s%n", velocidadeKmH,
                    (velocidadeKmH / FATOR_CONVERSÃO));
        }
    }
}
