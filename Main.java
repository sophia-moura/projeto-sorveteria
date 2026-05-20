

package com.ucb.poo.sorveteria;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println("\n===== SORVETERIA =====");
            System.out.println("1 - Produtos");
            System.out.println("2 - Pedidos");
            System.out.println("3 - Clientes");
            System.out.println("4 - Estoque");
            System.out.println("5 - Relatorios");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Produtos.menuProdutos();
                    break;

                case 2:
                    Pedidos.menuPedidos();
                    break;

                case 3:
                    Clientes.menuClientes();
                    break;

                case 4:
                    Estoque.menuEstoque();
                    break;

                case 5:
                    Relatorios.menuRelatorios();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

    }

}