package com.ucb.poo.sorveteria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=============================");
            System.out.println("   SORVETERIA - SISTEMA POO  ");
            System.out.println("=============================");
            System.out.println("1 - Produtos");
            System.out.println("2 - Clientes");
            System.out.println("3 - Pedidos");
            System.out.println("4 - Estoque");
            System.out.println("5 - Relatorios");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: Produtos.menuProdutos(); break;
                case 2: Clientes.menuClientes(); break;
                case 3: Pedidos.menuPedidos(); break;
                case 4: Estoque.menuEstoque(); break;
                case 5: Relatorios.menuRelatorios(); break;
                case 0: System.out.println("Encerrando o sistema. Ate logo!"); break;
                default: System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
