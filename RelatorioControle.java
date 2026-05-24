package controle;

import model.Pedido;
import model.Produto;
import model.Cliente;

public class RelatorioControle {

    public void produtosSemEstoque() {
        System.out.println("\n--- Produtos sem estoque ---");
        boolean encontrou = false;
        for (Produto p : ProdutoControle.listaProdutos) {
            if (p.getEstoque() == 0) {
                System.out.println(p.getNome() + " - sem estoque!");
                encontrou = true;
            }
        }
        if (!encontrou) System.out.println("Todos os produtos tEm estoque.");
    }

    public void totalDeVendas() {
        System.out.println("\n--- Total de vendas por produto ---");
        for (Produto p : ProdutoControle.listaProdutos) {
            System.out.println(p.getNome() + ": " + p.getVenda() + " unidade(s) vendida(s)");
        }
    }

    public void faturamentoTotal() {
        double total = 0;
        for (Produto p : ProdutoControle.listaProdutos) {
            total += p.calcularPreco() * p.getVenda();
        }
        System.out.println("\nFaturamento total: R$ " + String.format("%.2f", total));
    }

    public void clientesCadastrados() {
        System.out.println("\n--- Clientes cadastrados ---");
        if (ClienteControle.listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : ClienteControle.listaClientes) {
            System.out.println(c);
        }
        System.out.println("Total: " + ClienteControle.listaClientes.size() + " cliente(s).");
    }

    public void pedidosRealizados() {
        System.out.println("\n--- Pedidos realizados ---");
        if (PedidoControle.listaPedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
            return;
        }
        for (Pedido p : PedidoControle.listaPedidos) {
            System.out.println(p);
        }
    }
}
