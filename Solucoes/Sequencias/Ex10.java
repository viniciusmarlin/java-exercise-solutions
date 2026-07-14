package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Input
            int idade = scanner.nextInt();
            String categoria;

            // Lógica condicional
            if (idade < 8) {
                categoria = "Não tem idade para ser um nadador";
            } else if (idade < 11) {
                categoria = "Infantil";
            } else if (idade < 14) {
                categoria = "Juvenil A";
            } else if (idade < 18) {
                categoria = "Juvenil B";
            } else {
                categoria = "Senior";
            }

            // Output
            System.out.println(categoria);
        }
    }
}
