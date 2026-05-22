package view;

import java.util.Scanner;

import control.SistemaControl;

import model.Cliente;
import model.Pedido;

public class SistemaView {

    Scanner sc = new Scanner(System.in);

    public void menu(SistemaControl control) {

        int opcao;

        do {

            System.out.println("\n===== SORVETERIA =====");
            System.out.println("1- Produtos");
            System.out.println("2- Pedidos");
            System.out.println("3- Clientes");
            System.out.println("4- Estoque");
            System.out.println("5- Relatorio");
            System.out.println("0- Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1 -> System.out.println("AREA DE PRODUTOS");

                case 2 -> {
                    System.out.println("\n1-Novo Pedido");
                    System.out.println("2-Ver Pedidos");

                    int pedidoOpcao = sc.nextInt();
                    sc.nextLine();

                    switch(pedidoOpcao) {

                        case 1 -> {
                            System.out.print("Numero do pedido: ");
                            int numero = sc.nextInt();
                            sc.nextLine();

                            System.out.print("ID do cliente: ");
                            int idCliente = sc.nextInt();
                            sc.nextLine();

                            Cliente clienteEncontrado = null;

                            for(Cliente c : control.clientes) {

                                if(c.id == idCliente) {
                                    clienteEncontrado = c;
                                }
                            }

                            if(clienteEncontrado != null) {

                                System.out.print("Produto: ");
                                String produto = sc.nextLine();

                                control.pedidos.add(
                                        new Pedido(numero, produto, clienteEncontrado)
                                );

                                System.out.println("Pedido criado!");
                            }

                            else {

                                System.out.println("Cliente nao encontrado!");
                            }
                    }

                        case 2 -> {
                            for(Pedido p : control.pedidos) {
                                System.out.println(p);
                            }
                    }
                    }
                }

                case 3 -> {
                    System.out.println("\n1-Cadastrar Cliente");
                    System.out.println("2-Buscar Cliente");
                    System.out.println("3-Historico Cliente");

                    int clienteOpcao = sc.nextInt();
                    sc.nextLine();

                    switch(clienteOpcao) {

                        case 1:

                            System.out.print("ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            control.clientes.add(
                                    new Cliente(id, nome)
                            );

                            System.out.println("Cliente cadastrado!");

                            break;

                        case 2:

                            System.out.print("Digite o ID: ");
                            int buscar = sc.nextInt();

                            for(Cliente c : control.clientes) {

                                if(c.id == buscar) {
                                    System.out.println(c);
                                }
                            }

                            break;

                        case 3:

                            System.out.print("ID do cliente: ");
                            int historico = sc.nextInt();

                            for(Pedido p : control.pedidos) {

                                if(p.cliente.id == historico) {
                                    System.out.println(p);
                                }
                            }

                            break;
                    }
                }

                case 4 -> System.out.println("AREA DE ESTOQUE");

                case 5 -> System.out.println("AREA DE RELATORIO");
            }

        } while(opcao != 0);
    }
}