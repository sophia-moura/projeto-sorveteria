package model;

public class Pedido {
    
    public int numero;
    public String sabor;
    public Cliente cliente;
    
    public Pedido(int numero, String sabor, Cliente cliente) {
        this.numero = numero;
        this.sabor = sabor;
        this.cliente  = cliente;
    }

    @Override 
    public String toString() {
        return "Pedido" + numero + "Cliente:" + cliente.nome + "Sabor:" + sabor;
    }
    
    }