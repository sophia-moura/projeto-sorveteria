package controle;

import java.util.ArrayList;
import model.Produto;

public class ProdutoControle {

    public static ArrayList<Produto> listaProdutos =
            new ArrayList<>();

    public void cadastrarProduto(Produto produto) {

        listaProdutos.add(produto);

        System.out.println("Produto cadastrado!");
    }

    public void listarProdutos() {

        for (Produto p : listaProdutos) {

            System.out.println(
                    p.getId() + " | "
                    + p.getNome() + " | "
                    + p.getTipo() + " | R$ "
                    + p.getPreco() + " | Estoque: "
                    + p.getEstoque()
            );
        }
    }

    public void removerProduto(int id) {

        for (Produto p : listaProdutos) {

            if (p.getId() == id) {

                listaProdutos.remove(p);

                System.out.println("Produto removido!");

                break;
            }
        }
    }

    public void atualizarEstoque(int id, int estoque) {

        for (Produto p : listaProdutos) {

            if (p.getId() == id) {

                p.setEstoque(estoque);

                System.out.println("Estoque atualizado!");
            }
        }
    }
}