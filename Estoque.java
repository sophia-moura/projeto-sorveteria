
package com.ucb.poo.sorveteria;

import java.util.Scanner;

public class Estoque {
   
    static Scanner sc = new Scanner(System.in);

    public static void menuEstoque() {

        int opcao;

        do {

            System.out.println("\n===== ESTOQUE =====");
            System.out.println("1 - Ver estoque");
            System.out.println("2 - Adicionar quantidade");
            System.out.println("3 - Remover quantidade");
            System.out.println("4 - Atualizar estoque");
            System.out.println("0 - Voltar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Estoque disponivel!");
                    break;

                case 2:
                    System.out.println("Quantidade adicionada!");
                    break;

                case 3:
                    System.out.println("Quantidade removida!");
                    break;

                case 4:
                    System.out.println("Estoque atualizado!");
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
    

