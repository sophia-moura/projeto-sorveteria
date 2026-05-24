package com.ucb.poo.sorveteria;

import controle.RelatorioControle;

import java.util.Scanner;

public class Relatorios {

    static Scanner sc = new Scanner(System.in);
    static RelatorioControle controle = new RelatorioControle();

    public static void menuRelatorios() {

        int opcao;

        do {
            System.out.println("\n===== RELATORIOS =====");
            System.out.println("1 - Total de vendas por produto");
            System.out.println("2 - Faturamento total");
            System.out.println("3 - Pedidos realizados");
            System.out.println("4 - Clientes cadastrados");
            System.out.println("5 - Produtos sem estoque");
            System.out.println("0 - Voltar");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    controle.totalDeVendas();
                    break;

                case 2:
                    controle.faturamentoTotal();
                    break;

                case 3:
                    controle.pedidosRealizados();
                    break;

                case 4:
                    controle.clientesCadastrados();
                    break;

                case 5:
                    controle.produtosSemEstoque();
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);
    }
}
