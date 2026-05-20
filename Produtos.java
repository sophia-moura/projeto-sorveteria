
package com.ucb.poo.sorveteria;

import java.util.Scanner;
        
public class Produtos {
    
    static Scanner sc = new Scanner(System.in);

    public static void menuProdutos() {

        int opcao;

        do {

            System.out.println("\n===== PRODUTOS =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("0 - Voltar");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Produto cadastrado!");
                    break;

                case 2:
                    System.out.println("Lista de produtos!");
                    break;

                case 3:
                    System.out.println("Produto atualizado!");
                    break;

                case 4:
                    System.out.println("Produto removido!");
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
