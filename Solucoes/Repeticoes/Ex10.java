package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            char sexo;
            String frequente, opcao = "";
            int idade, codigo,
                    total = 0, totalServicos = 0, totalHomens = 0, totalMulheres = 0;

            do {
                System.out.println("-----------------");
                System.out.println("1. Compras");
                System.out.println("2. Serviços");
                System.out.println("3. Lazer");
                System.out.println("4. Alimentação");
                System.out.println("5. Saida");
                System.out.println("-----------------");
                System.out.print("Digite o código desejado: ");
                codigo = scanner.nextInt();

                if (codigo == 5) {
                    System.out.println("Encerrando pesquisa e gerando relatórios...");
                    System.out.println("-----------------");
                    break;
                }

                if (codigo < 1 || codigo > 5) {
                    System.out.println("Opção inválida. Digite um número de 1 a 5.");
                    System.out.println("-----------------");
                    continue; // Volta para o início do do-while sem pedir idade/sexo
                }

                System.out.print("Qual sua idade: ");
                idade = scanner.nextInt();

                System.out.print("Qual seu sexo: ");
                sexo = scanner.next().toUpperCase().charAt(0);

                while (sexo != 'H' && sexo != 'M') {
                    System.out.print("Digite um sexo válido (H/M): ");
                    sexo = scanner.next().toUpperCase().charAt(0);
                }

                if (sexo == 'H') {
                    totalHomens++;
                } else {
                    totalMulheres++;
                }

                switch (codigo) {
                    case 1:
                        opcao = "Opção escolhida: Compras";
                        total++;
                        break;
                    case 2:
                        opcao = "Opção escolhida: Serviços";
                        total++;
                        totalServicos++;
                        break;
                    case 3:
                        opcao = "Opção escolhida: Lazer";
                        total++;
                        break;
                    case 4:
                        opcao = "Opção escolhida: Alimentação";
                        total++;
                        break;
                }

                System.out.println(opcao);
                System.out.println("-----------------");

            } while (codigo != 5);

            if (total > 0) {
                frequente = (totalHomens > totalMulheres) ? "Homens são mais frequentes"
                        : "Mulheres são mais frequentes";
                System.out.println("RELÁTORIO: " + frequente);

                System.out.printf("Percentual: %.2f%%%n", ((double) totalServicos / total) * 100);
            } else {
                System.out.println("Nenhum serviço ou compra foi registrado.");
            }
            System.out.println("-----------------");

        }
    }
}