package Solucoes.Switch;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs

        System.out.print("Escreva o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Escreva o segundo número: ");
        int b = scanner.nextInt();

        // Lógica
        int calculo = a + b;

        // Output
        System.out.println("Soma: " + calculo);

        scanner.close();
    }
}
