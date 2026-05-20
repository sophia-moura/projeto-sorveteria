
package com.ucb.poo.sorveteria;

import java.util.Scanner;

public class Pedidos {
    
    static Scanner sc = new Scanner(System.in);

    public static void menuPedidos() {

        int opcao;

        do {

            System.out.println("\n===== PEDIDOS =====");
            System.out.println("1 - Novo pedido");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Finalizar pedido");
            System.out.println("4 - Ver pedidos");
            System.out.println("0 - Voltar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Novo pedido criado!");
                    break;

                case 2:
                    System.out.println("Produto adicionado!");
                    break;

                case 3:
                    System.out.println("Pedido finalizado!");
                    break;

                case 4:
                    System.out.println("Lista de pedidos!");
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
    

