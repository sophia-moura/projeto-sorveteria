package controle;

import model.Produto;

public class EstoqueControle {

    public void verEstoque(){
        
        for (Produto p : ProdutoControle.listaProdutos) {
            System.out.println("Produto: " + p.nome);
            System.out.println("Quantidade: " + p.getEstoque());
            System.out.println("Preco: R$ /n" + p.preco);
        }
    }
    
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

    public void atualizarEstoque(String nome, int novoEstoque){
        
        for (Produto p : ProdutoControle.listaProdutos){
            if (p.getId() == id){
                
                p.setEstoque(novoEstoque);
                
                System.out.println("Estoque atualizado com sucesso!");
            }
        }
    }
}