package model;

public class Picole extends Produto {

    private String sabor;

    public Picole(int id, String nome, double preco, int estoque, String sabor) {
        super(id, nome, "Picole", preco, estoque);
        this.sabor = sabor;
    }

    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    @Override
    public double calcularPreco() {
        // Picole nao tem acrescimo
        return preco;
    }

    @Override
    public String toString() {
        return super.toString() + " | Sabor: " + sabor;
    }
}
