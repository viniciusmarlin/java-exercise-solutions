package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Input sexo
            System.out.print("Digite H para homem ou M para mulher: ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            // Condicional
            if (sexo != 'H' && sexo != 'M') {
                System.out.println("Digite um genero válido");
                return;
            }

            // Input altura
            System.out.print("Digite sua altura: ");
            double altura = scanner.nextDouble();

            // Output & Lógica
            double pesoIdeal = (sexo == 'H') ? (72.7 * altura) - 44.7 : (62.1 * altura) - 38.7;
            System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);
        }
    }
}
