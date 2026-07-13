package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        //Inputs
        int par = 0, impar = 0;
        int numero;

        //Loop
        do {
            System.out.print("Escreva um número: ");
            numero = scanner.nextInt();

            // Se o numero inserido for igual a -1 o algoritmo para
            if(numero == -1) {
                break;
            }
            
            // Se o número não for igual a -1, verificar se o resto da divisão é 1 ou 0
            int logica = numero % 2;
            
            if(logica == 0) {
                par++;
            } else {
                impar++;
            }

        } while (true);

        //Output
        System.out.println("A quantia de números pares é igual a: " + par);
        System.out.println("A quantia de números impares é igual a: " + impar);


        scanner.close();
    }
}
