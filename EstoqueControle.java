package controle;

import model.Produto;

public class EstoqueControle {

    public void verEstoque() {
        if (ProdutoControle.listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto no estoque.");
            return;
        }
        for (Produto p : ProdutoControle.listaProdutos) {
            System.out.println("Produto: " + p.getNome()
                    + " | Quantidade: " + p.getEstoque()
                    + " | Preco: R$ " + String.format("%.2f", p.getPreco()));
        }
    }

    public void adicionarEstoque(int id, int qtd) {
        for (Produto p : ProdutoControle.listaProdutos) {
            if (p.getId() == id) {
                p.setEstoque(p.getEstoque() + qtd);
                System.out.println("Quantidade adicionada! Novo estoque: " + p.getEstoque());
                return;
            }
        }
        System.out.println("Produto nao encontrado!");
    }

    public void removerEstoque(int id, int qtd) {
        for (Produto p : ProdutoControle.listaProdutos) {
            if (p.getId() == id) {
                if (p.getEstoque() < qtd) {
                    System.out.println("Estoque insuficiente!");
                    return;
                }
                p.setEstoque(p.getEstoque() - qtd);
                System.out.println("Quantidade removida! Novo estoque: " + p.getEstoque());
                return;
            }
        }
        System.out.println("Produto nao encontrado!");
    }

    public void atualizarEstoque(int id, int novoEstoque) {
        for (Produto p : ProdutoControle.listaProdutos) {
            if (p.getId() == id) {
                p.setEstoque(novoEstoque);
                System.out.println("Estoque atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto nao encontrado!");
    }
}
