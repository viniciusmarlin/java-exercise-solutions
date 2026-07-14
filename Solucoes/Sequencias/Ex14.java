package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Informe a quantia em reais: R$");
            double valorReais = scanner.nextDouble(), valorMoeda = 0;

            System.out.println("Digite o tipo de moeda: 1. Dolar 2. Libra 3. Peso");
            System.out.print("Opção: ");
            int tipoMoeda = scanner.nextInt();

            String moeda;

            // Logica condicional
            if (tipoMoeda == 1) {
                moeda = "dolar";
                valorMoeda = 1.87;
            } else if (tipoMoeda == 2) {
                moeda = "libra";
                valorMoeda = 3.05;
            } else if (tipoMoeda == 3) {
                moeda = "peso";
                valorMoeda = 1.40;
            } else {
                System.out.println("Moeda inválida");
                return;
            }

            // Output & Lógica
            System.out.printf("O valor: R$%.2f convertido para: %s equivale a: %.2f", valorReais, moeda,
                    (valorReais / valorMoeda));
        }
    }
}
