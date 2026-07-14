package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Inputs
            System.out.print("Digite o valor do salario: R$");
            double salario = scanner.nextDouble();

            double salarioMinimo = 1621;
            double porcentagem;

            // Lógica condicional
            if (salario <= (salarioMinimo * 3)) {
                porcentagem = 0.1;
            } else if (salario <= (salarioMinimo * 10)) {
                porcentagem = 0.2;
            } else {
                porcentagem = 0.3;
            }

            // Output & Lógica
            System.out.printf("O imposto é de aproximadamente: R$%.2f",
                    (salario * porcentagem));
        }
    }
}
