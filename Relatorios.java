
package com.ucb.poo.sorveteria;

import java.util.Scanner;

public class Relatorios {
   
    static Scanner sc = new Scanner(System.in);

    public static void menuRelatorios() {

        int opcao;

        do {

            System.out.println("\n===== RELATÓRIOS =====");
            System.out.println("1 - Produtos mais vendidos");
            System.out.println("2 - Total de vendas do dia");
            System.out.println("3 - Pedidos realizados");
            System.out.println("4 - Clientes cadastrados");
            System.out.println("5 - Produtos sem estoque");
            System.out.println("6 - Faturamento total");
            System.out.println("0 - Voltar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Produtos mais vendidos!");
                    break;

                case 2:
                    System.out.println("Total de vendas do dia!");
                    break;

                case 3:
                    System.out.println("Pedidos realizados!");
                    break;

                case 4:
                    System.out.println("Clientes cadastrados!");
                    break;

                case 5:
                    System.out.println("Produtos sem estoque!");
                    break;

                case 6:
                    System.out.println("Faturamento total!");
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

    }

}
    

