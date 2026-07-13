package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex0301 {
    public static void main(String[] args) {
        //Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        //Inputs
        int quantiaNumeros = scanner.nextInt();
        int par = 0, impar = 0;

        //Loop
        for (int i = quantiaNumeros; i > 0; i--) {
            int logica = i % 2;
            
            if(logica == 0) {
                par++;
            } else {
                impar++;
            }

        }

        //Output
        System.out.println("A quantia de números pares é igual a: " + par);
        System.out.println("A quantia de números impares é igual a: " + impar);


        scanner.close();
    }
}
