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

            System.out.println("\n1-Cadastrar Cliente");
            System.out.println("2-Listar Clientes");
            System.out.println("3-Criar Pedido");
            System.out.println("4-Listar Pedidos");
            System.out.println("0-Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {

                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    control.clientes.add(
                            new Cliente(id, nome)
                    );
                }

                case 2 -> {
                    for(Cliente c : control.clientes) {
                        System.out.println(c);
                    }
                }

                case 3 -> {
                    System.out.print("Número do pedido: ");
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

                        System.out.print("Sabor: ");
                        String sabor = sc.nextLine();

                        control.pedidos.add(
                                new Pedido(numero, sabor, clienteEncontrado)
                        );

                        System.out.println("Pedido criado!");
                    }

                    else {

                        System.out.println("Cliente não encontrado!");
                    }
                }

                case 4 -> {
                    for(Pedido p : control.pedidos) {
                        System.out.println(p);
                    }
                }
            }

        } while(opcao != 0);
    }
}
