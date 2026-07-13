package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Input
        int numero = scanner.nextInt();

        // Lógica
        int calculo = numero % 2;

        // Lógica condicional
        if (calculo == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        scanner.close();
    }
}
