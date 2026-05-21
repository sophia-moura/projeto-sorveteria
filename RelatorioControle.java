package controle;

import model.Produto;

public class RelatorioControle {

    public void produtosSemEstoque() {

        for (Produto p : ProdutoControle.listaProdutos) {

            if (p.getEstoque() == 0) {

                System.out.println(
                        p.getNome() + " sem estoque!"
                );
            }
        }
    }

    public void listarProdutos() {

        for (Produto p : ProdutoControle.listaProdutos) {

            System.out.println(
                    p.getNome()
                    + " | Estoque: "
                    + p.getEstoque()
            );
        }
    }
}