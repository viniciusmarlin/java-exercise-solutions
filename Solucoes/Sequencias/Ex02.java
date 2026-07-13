package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        //Inputs

        System.out.print("Escreva o valor do primeiro posto: R$");
        double postoUm = scanner.nextDouble();

        System.out.print("Escreva o valor do segundo posto: R$");
        double postoDois = scanner.nextDouble();

        System.out.print("Escreva o valor do terceiro posto: R$");
        double postoTres = scanner.nextDouble();

        //Lógica
        double calculo = (postoUm + postoDois + postoTres)/3;

        //Output
        System.out.println("Média: R$" + calculo);

        scanner.close();
    }
}
