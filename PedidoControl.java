package controle;

import java.util.ArrayList;
import model.Pedido;

public class PedidoControle {

    public static ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public void cadastrarPedido(Pedido pedido) {
        listaPedidos.add(pedido);
        System.out.println("Pedido registrado com sucesso!");
    }

    public void listarPedidos() {
        if (listaPedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
            return;
        }
        for (Pedido p : listaPedidos) {
            System.out.println(p);
        }
    }

    public Pedido buscarPedido(int numero) {
        for (Pedido p : listaPedidos) {
            if (p.getNumero() == numero) {
                return p;
            }
        }
        System.out.println("Pedido nao encontrado!");
        return null;
    }

    public void atualizarQuantidade(int numero, int novaQuantidade) {
        Pedido p = buscarPedido(numero);
        if (p != null) {
            p.setQuantidade(novaQuantidade);
            System.out.println("Pedido atualizado com sucesso!");
        }
    }

    public void removerPedido(int numero) {
        Pedido remover = buscarPedido(numero);
        if (remover != null) {
            listaPedidos.remove(remover);
            System.out.println("Pedido removido com sucesso!");
        }
    }
}
