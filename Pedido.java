package model;

public class Pedido {

    public int numero;
    public String produto;
    public Cliente cliente;

    public Pedido(int numero, String produto, Cliente cliente) {

        this.numero = numero;
        this.produto = produto;
        this.cliente = cliente;
    }

    @Override
    public String toString() {

        return "Pedido " + numero +
               " | Cliente: " + cliente.nome +
               " | Produto: " + produto;
    }
}