package com.ucb.poo.sorveteria;

import controle.EstoqueControle;

import java.util.Scanner;

public class Estoque {

    static Scanner sc = new Scanner(System.in);
    static EstoqueControle controle = new EstoqueControle();

    public static void menuEstoque() {

        int opcao;

        do {
            System.out.println("\n===== ESTOQUE =====");
            System.out.println("1 - Ver estoque");
            System.out.println("2 - Adicionar quantidade");
            System.out.println("3 - Remover quantidade");
            System.out.println("4 - Atualizar estoque");
            System.out.println("0 - Voltar");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    controle.verEstoque();
                    break;

                case 2:
                    System.out.print("ID do produto: ");
                    int idAdd = sc.nextInt(); sc.nextLine();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = sc.nextInt(); sc.nextLine();
                    controle.adicionarEstoque(idAdd, qtdAdd);
                    break;

                case 3:
                    System.out.print("ID do produto: ");
                    int idRem = sc.nextInt(); sc.nextLine();
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = sc.nextInt(); sc.nextLine();
                    controle.removerEstoque(idRem, qtdRem);
                    break;

                case 4:
                    System.out.print("ID do produto: ");
                    int idAtualizar = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo valor de estoque: ");
                    int novoEstoque = sc.nextInt(); sc.nextLine();
                    controle.atualizarEstoque(idAtualizar, novoEstoque);
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
