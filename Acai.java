package model;

public class Acai extends Produto {

    private String tamanho;

    public Acai(int id, String nome, double preco, int estoque, String tamanho) {
        super(id, nome, "Acai", preco, estoque);
        this.tamanho = tamanho;
    }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    @Override
    public double calcularPreco() {
        // Acai tem acrescimo de 5%
        return preco * 1.05;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tamanho: " + tamanho;
    }
}
