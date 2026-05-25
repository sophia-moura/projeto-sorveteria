package model;

public class Pedido {

    private int numero;
    private Produto produto;
    private Cliente cliente;
    private int quantidade;

    public Pedido(int numero, Produto produto, Cliente cliente, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.cliente = cliente;
        this.quantidade = quantidade;
    }

    public int getNumero() { return numero; }
    public Produto getProduto() { return produto; }
    public Cliente getCliente() { return cliente; }
    public int getQuantidade() { return quantidade; }

    public void setProduto(Produto produto) { this.produto = produto; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "Pedido " + numero
                + " | Cliente: " + cliente.getNome()
                + " | Produto: " + produto.getNome()
                + " | Qtd: " + quantidade
                + " | Total: R$ " + String.format("%.2f", produto.calcularPreco() * quantidade);
    }
}
