package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char sexo;
            String conteudo = " ";
            int idade, estadoCivil, totalCasado = 0, totalSolteiro = 0, totalIdadeMulheres = 0, totalMulheres = 0;

            for (int i = 0; i < 5; i++) {

                System.out.print("Digite seu sexo: ");
                sexo = scanner.next().toUpperCase().charAt(0);
                while (sexo != 'M' && sexo != 'F') {
                    System.out.print("Digite um sexo válido: ");
                    sexo = scanner.next().toUpperCase().charAt(0);
                }

                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();

                if (sexo == 'F') {
                    totalMulheres++;
                    totalIdadeMulheres += idade;
                }

                System.out.println("------------------");
                System.out.println("1 - Casado");
                System.out.println("2 - Solteiro");
                System.out.println("------------------");
                System.out.print("Seu estado civil atual é: ");
                estadoCivil = scanner.nextInt();

                while (estadoCivil < 1 || estadoCivil > 2) {
                    System.out.println("Estado civil inválido.");
                    estadoCivil = scanner.nextInt();
                }

                switch (estadoCivil) {
                    case 1:
                        conteudo = "Casado";
                        totalCasado++;
                        break;
                    case 2:
                        conteudo = "Solteiro";
                        totalSolteiro++;
                }

                System.out.println("------------------");
                System.out.print("Opção selecionada: " + conteudo);
            }

            if (totalIdadeMulheres != 0)
                System.out.printf("A média da idade das mulheres são: %d%n", (totalIdadeMulheres / totalMulheres));
            else
                System.out.println("Não houve mulheres registradas.");

            String resultado = (totalCasado > totalSolteiro) ? "Há mais casados" : "Há mais solteiros";
            System.out.println(resultado);
        }
    }
}
