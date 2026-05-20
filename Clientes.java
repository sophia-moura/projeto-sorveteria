
package com.ucb.poo.sorveteria;

import java.util.Scanner;

public class Clientes {

    static Scanner sc = new Scanner(System.in);

    public static void menuClientes() {

        int opcao;

        do {

            System.out.println("\n===== CLIENTES =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Buscar cliente");
            System.out.println("3 - Histórico");
            System.out.println("0 - Voltar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cliente cadastrado!");
                    break;

                case 2:
                    System.out.println("Cliente encontrado!");
                    break;

                case 3:
                    System.out.println("Histórico do cliente!");
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
    

