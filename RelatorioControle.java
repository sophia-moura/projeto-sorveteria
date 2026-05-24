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

    public void totalDeVendas() {

        for (Produto p : ProdutoControle.listaProdutos) {

            System.out.println("Total de vendas: " + p.getVenda());
        }
    }
    
    public void faturamentoTotal(){
        
        double total = 0;
        
        for (Produto p: ProdutoControle.listaProdutos){
            
            total +=
                    p.getPreco() * p.getVenda();
        }
        System.out.println("Faturamento total: R$" + total);
    }
    
    public void clientesCadastrados(){
        
        for (Cliente c : ClienteControle.listaClientes){
        }
        
        System.out.println("Total de clientes: " + ClienteControle.listaClientes);
    }
    
    public void pedidosRealizados(){
        for (Pedido p : Pedido.listaPedido){
                
            System.out.println("Pedido: " + p.getId());
            System.out.println("Cliente: " + p.getCliente().getNome());
            System.out.println("Produto: " + p.getProduto().getNome());
            System.out.println("Quantidade: " + p.getEstoque());
        }
    }
}