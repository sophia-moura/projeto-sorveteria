package model;

public class Sorvete extends Produto {

    private String sabor;

    public Sorvete(int id, String nome, double preco, int estoque, String sabor) {
        super(id, nome, "Sorvete", preco, estoque);
        this.sabor = sabor;
    }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    @Override
    public double calcularPreco() {
        // Sorvete não tem acréscimo
        return preco;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sabor: " + sabor;
    }
}
