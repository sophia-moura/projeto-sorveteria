
package com.ucb.poo.sorveteria;

import controle.ClienteControle;
import controle.PedidoControle;
import model.Cliente;
import model.Pedido;

import java.util.Scanner;

public class Clientes {

    static Scanner sc = new Scanner(System.in);
    static ClienteControle controle = new ClienteControle();
    
    public static void menuClientes() {

        int opcao;

        do {

            System.out.println("\n===== CLIENTES =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar cliente");
            System.out.println("3 - Buscar cliente");
            System.out.println("4 - Atualizar cliente");
            System.out.println("5 - Remover cliente");
            System.out.println("6 - Historico de pedidos");
            System.out.println("0 - Voltar");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();
                    controle.cadastrarCliente(new Cliente(id, nome, tel));
                    break; 

                case 2:
                    controle.listarClientes();
                    break;

                case 3:
                    System.out.print("ID do cliente: ");
                    int idBusca = sc.nextInt(); sc.nextLine();
                    var c = controle.buscarCliente(idBusca);
                    if (c != null) System.out.println(c);
                    break;

                case 4:
                    System.out.print("ID do cliente a atualizar: ");
                    int idAtualizar = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo telefone: ");
                    String novoTel = sc.nextLine();
                    controle.atualizarCliente(idAtualizar, novoNome, novoTel);
                    break;

                case 5:
                    System.out.print("ID do cliente a remover: ");
                    int idRemover = sc.nextInt(); sc.nextLine();
                    controle.removerCliente(idRemover);
                    break;

                case 6:
                    System.out.print("ID do cliente: ");
                    int idHistorico = sc.nextInt(); sc.nextLine();
                    boolean encontrou = false;
                    for (Pedido p : PedidoControle.listaPedidos) {
                        if (p.getCliente().getId() == idHistorico) {
                            System.out.println(p);
                            encontrou = true;
                        }
                    }
                    if (!encontrou) System.out.println("Nenhum pedido encontrado para este cliente.");
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
    

