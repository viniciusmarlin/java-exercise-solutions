package Solucoes.Repeticoes;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            char sexo;
            boolean primeiro;
            String conteudo = " ";
            int tipo, maiorVenda, totalHomens = 0, totalMulheres = 0, totalAventura = 0, totalFiccao = 0,
                    totalRomance = 0,
                    totalHomensRomanticos = 0;

            do {
                System.out.println("----------------");
                System.out.println("1 - Ficção");
                System.out.println("2 - Romance");
                System.out.println("3 - Aventura");
                System.out.println("----------------");
                System.out.print("Digite o tipo do livro: ");
                tipo = scanner.nextInt();

                if (tipo == 0) {
                    System.out.println("Encerrando algoritmo");
                    break;
                }

                if (tipo < 0 || tipo > 3) {
                    System.out.println("Opção inválida. Digite uma opção de 0 a 3.");
                    System.out.println("-----------------");
                    continue; // Volta para o início do do-while sem pedir idade/sexo
                }

                System.out.print("Qual seu sexo: ");
                sexo = scanner.next().toUpperCase().charAt(0);

                while (sexo != 'M' && sexo != 'F') {
                    System.out.print("Digite um sexo válido (M/F): ");
                    sexo = scanner.next().toUpperCase().charAt(0);
                }

                if (sexo == 'M')
                    totalHomens++;
                else
                    totalMulheres++;

                switch (tipo) {
                    case 1:
                        conteudo = "Tipo de livro escolhido: Ficção";
                        totalFiccao++;
                        break;
                    case 2:
                        conteudo = "Tipo de livro escolhido: Romance";
                        if (sexo == 'M')
                            totalHomensRomanticos++;

                        totalRomance++;
                        break;
                    case 3:
                        conteudo = "Tipo de livro escolhido: Aventura";
                        totalAventura++;
                        break;
                }
                System.out.println(conteudo);

            } while (true);
            if ((totalHomens + totalMulheres) > 0) {
                if (totalHomens > 0) {
                    System.out.printf("Percentual de homens que leem romance: %.2f%%%n",
                            ((double) totalHomensRomanticos / totalHomens) * 100);
                } else {
                    System.out.println(
                            "Percentual de homens que leem romance: Ninguém do sexo masculino foi registrado.");
                }

                maiorVenda = Math.max(totalAventura, Math.max(totalFiccao, totalRomance));

                System.out.print("Tipo(s) de livro mais vendido(s): ");
                primeiro = true;

                if (totalFiccao == maiorVenda) {
                    System.out.print("Ficção");
                    primeiro = false;
                }
                if (totalRomance == maiorVenda) {
                    if (!primeiro)
                        System.out.print(" e ");
                    System.out.print("Romance");
                    primeiro = false;
                }
                if (totalAventura == maiorVenda) {
                    if (!primeiro)
                        System.out.print(" e ");
                    System.out.print("Aventura");
                }

            } else {
                System.out.println("Nenhum serviço ou compra foi registrado.");
            }
            System.out.println("-----------------");
        }
    }
}
