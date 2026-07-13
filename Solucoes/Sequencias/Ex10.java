package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Input
        int idade = scanner.nextInt();

        // Lógica condicional
        if (idade < 8) {
            System.out.println("Não tem idade para ser um nadador");
        } else if (idade < 11) {
            System.out.println("Infantil");
        } else if (idade < 14) {
            System.out.println("Juvenil A");
        } else if (idade < 18) {
            System.out.println("Juvenil B");
        } else {
            System.out.println("Adulto");
        }

        scanner.close();
    }
}
