package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Input
            int numero = scanner.nextInt();

            // Logica & Output
            String resultado = (numero % 2 == 0) ? "Par" : "Impar";
            System.out.println(resultado);
        }
    }
}
