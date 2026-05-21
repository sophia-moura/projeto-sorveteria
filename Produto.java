package model;

public class Produto {

    private int id;
    private String nome;
    private String tipo;
    private double preco;
    private int estoque;

    public Produto(int id, String nome,
            String tipo, double preco, int estoque) {

        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}