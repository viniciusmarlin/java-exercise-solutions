package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs
        double salario = scanner.nextDouble();
        double salarioMinimo = 1621;
        double imposto;

        // Lógica condicional
        if (salario <= (salarioMinimo * 3)) {
            imposto = salario * 0.1;
        } else if (salario <= (salarioMinimo * 10)) {
            imposto = salario * 0.2;
        } else {
            imposto = salario * 0.3;
        }

        // Output
        System.out.printf("O imposto é de aproximadamente: %.2f", imposto);

        scanner.close();
    }
}
