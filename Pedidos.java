
package com.ucb.poo.sorveteria;

import controle.ClienteControle;
import controle.PedidoControle;
import controle.ProdutoControle;
import model.Cliente;
import model.Pedido;
import model.Produto;

import java.util.Scanner;

public class Pedidos {
    
    static Scanner sc = new Scanner(System.in);
    static PedidoControle controle = new PedidoControle();

    public static void menuPedidos() {

        int opcao;

        do {

            System.out.println("\n===== PEDIDOS =====");
            System.out.println("1 - Novo pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Buscar pedido");
            System.out.println("4 - Atualizar quantidade");
            System.out.println("5 - Remover pedido");
            System.out.println("0 - Voltar");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Numero do pedido: ");
                    int numero = sc.nextInt(); sc.nextLine();

                    System.out.print("ID do cliente: ");
                    int idCliente = sc.nextInt(); sc.nextLine();
                    Cliente cliente = null;
                    for (Cliente c : ClienteControle.listaClientes) {
                        if (c.getId() == idCliente) { cliente = c; break; }
                    }
                    if (cliente == null) { System.out.println("Cliente nao encontrado!"); break; }

                    System.out.print("ID do produto: ");
                    int idProduto = sc.nextInt(); sc.nextLine();
                    Produto produto = null;
                    for (Produto p : ProdutoControle.listaProdutos) {
                        if (p.getId() == idProduto) { produto = p; break; }
                    }
                    if (produto == null) { System.out.println("Produto nao encontrado!"); break; }

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt(); sc.nextLine();

                    if (produto.getEstoque() < qtd) {
                        System.out.println("Estoque insuficiente!");
                        break;
                    }

                    produto.setEstoque(produto.getEstoque() - qtd);
                    produto.setVenda(produto.getVenda() + qtd);
                    controle.cadastrarPedido(new Pedido(numero, produto, cliente, qtd));
                    break;

                case 2:
                   controle.listarPedidos();
                    break;

                case 3:
                    System.out.print("Numero do pedido: ");
                    int numBusca = sc.nextInt(); sc.nextLine();
                    var ped = controle.buscarPedido(numBusca);
                    if (ped != null) System.out.println(ped);
                    break;

                case 4:
                    System.out.print("Numero do pedido: ");
                    int numAtualizar = sc.nextInt(); sc.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQtd = sc.nextInt(); sc.nextLine();
                    controle.atualizarQuantidade(numAtualizar, novaQtd);
                    break;

                case 5:
                    System.out.print("Numero do pedido a remover: ");
                    int numRemover = sc.nextInt(); sc.nextLine();
                    controle.removerPedido(numRemover);
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
    

