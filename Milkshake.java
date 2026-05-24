package model;

public class Milkshake extends Produto {

    private int ml;

    public Milkshake(int id, String nome, double preco, int estoque, int ml) {
        super(id, nome, "Milkshake", preco, estoque);
        this.ml = ml;
    }

    public int getMl() { return ml; }
    public void setMl(int ml) { this.ml = ml; }

    @Override
    public double calcularPreco() {
        // Milkshake tem acréscimo de 10% por ser maior
        return preco * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + " | Volume: " + ml + "ml";
    }
}
