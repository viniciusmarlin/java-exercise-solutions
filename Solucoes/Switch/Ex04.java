package Solucoes.Switch;

/*
4) Escreva um programa que leia dois números e a operação a ser realizada  (+, -, *, /).
*/
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Instancia do Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            double operador = 1;

            System.out.print("Escreva um valor: ");
            int a = scanner.nextInt();

            System.out.print("Escreva uma operação (+, -, *, /): ");
            char operacao = scanner.next().toUpperCase().charAt(0);

            while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
                System.out.print("Escreva uma operação correta (+, -, *, /): ");
                operacao = scanner.next().toUpperCase().charAt(0);
            }

            System.out.print("Escreva um valor: ");
            int b = scanner.nextInt();

            while (operacao == '/' && b == 0) {
                System.out.print("Não é possivel dividir por 0. Digite outro segundo valor: ");
                b = scanner.nextInt();
            }

            switch (operacao) {
                case '+':
                    operador = a + b;
                    break;
                case '-':
                    operador = a - b;
                    break;
                case '*':
                    operador = a * b;
                    break;
                case '/':
                    operador = (double) a / b;
                    break;
            }

            System.out.println("Resultado: " + operador);
        }
    }
}