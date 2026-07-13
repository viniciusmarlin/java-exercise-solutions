package Solucoes.Sequencias;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Instacia do Scanner
        Scanner scanner = new Scanner(System.in);

        // Inputs
        double velocidadeEmKm = scanner.nextDouble();
        double metrosEmKm = 3.6;

        // Lógica
        double calculo = velocidadeEmKm / metrosEmKm;

        // Output
        System.out.print(velocidadeEmKm + "km/h equivalem a " + calculo + "m/s");
        scanner.close();
    }
}
