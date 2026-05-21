package controle;

import model.Produto;

public class EstoqueControle {

    public void adicionarEstoque(int id, int qtd) {

        for (Produto p : ProdutoControle.listaProdutos) {

            if (p.getId() == id) {

                p.setEstoque(
                        p.getEstoque() + qtd
                );

                System.out.println("Quantidade adicionada!");
            }
        }
    }

    public void removerEstoque(int id, int qtd) {

        for (Produto p : ProdutoControle.listaProdutos) {

            if (p.getId() == id) {

                p.setEstoque(
                        p.getEstoque() - qtd
                );

                System.out.println("Quantidade removida!");
            }
        }
    }
}