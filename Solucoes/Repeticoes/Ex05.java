package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
    
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Fatorial: ");
            int numero = scanner.nextInt();
            int fatorial = 1;

            for (int i = numero; i > 1; i--) {
                fatorial = fatorial * i;
            }
            
            System.out.print("Resultado: " + fatorial);
        }
    }
}
