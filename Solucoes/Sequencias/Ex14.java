package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // Instancia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs
        double valorReais = scanner.nextDouble(), valorMoeda, convertido;
        int tipoMoeda = scanner.nextInt();

        String moeda;

        // Logica condicional
        if (tipoMoeda == 1) {
            moeda = "dolar";
            valorMoeda = 1.87;
            convertido = valorReais / valorMoeda;

        } else if (tipoMoeda == 2) {
            moeda = "libra";
            valorMoeda = 3.05;
            convertido = valorReais / valorMoeda;
        } else {
            moeda = "peso";
            valorMoeda = 1.40;
            convertido = valorReais / valorMoeda;
        }

        // Output
        System.out.println("O valor: R$" + valorReais + " convertido para: " + moeda + " equivale a: " + convertido);
    }
}
