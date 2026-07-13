package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Input sexo
        System.out.print("Digite H para homem ou M para mulher: ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        // Condicional
        if (sexo != 'H' && sexo != 'M') {
            System.out.println("Digite um genero válido");
            return;
        }

        // Input altura
        double altura = scanner.nextDouble();

        // Lógica condicional
        if (sexo == 'H') {
            double calculo = (72.7 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f", calculo);
        } else if (sexo == 'M') {
            double calculo = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f", calculo);
        }

        scanner.close();
    }
}
