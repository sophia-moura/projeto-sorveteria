package model;

public abstract class Produto {

    protected int id;
    protected String nome;
    protected String tipo;
    protected double preco;
    protected int estoque;
    protected int venda;

    public Produto(int id, String nome, String tipo, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.estoque = estoque;
        this.venda = 0;
    }

    // Método abstrato para polimorfismo
    public abstract double calcularPreco();

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getTipo() { return tipo; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
    public int getVenda() { return venda; }

    public void setNome(String nome) { this.nome = nome; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setEstoque(int estoque) { this.estoque = estoque; }
    public void setVenda(int venda) { this.venda = venda; }

    @Override
    public String toString() {
        return id + " | " + nome + " | " + tipo + " | R$ " + String.format("%.2f", preco) + " | Estoque: " + estoque;
    }
}
