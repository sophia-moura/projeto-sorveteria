package controle;

import java.util.ArrayList;
import model.Cliente;

public class ClienteControle {

    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {
        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }
    }

    public Cliente buscarCliente(int id) {
        for (Cliente c : listaClientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        System.out.println("Cliente nao encontrado!");
        return null;
    }

    public void atualizarCliente(int id, String novoNome, String novoTelefone) {
        Cliente c = buscarCliente(id);
        if (c != null) {
            c.setNome(novoNome);
            c.setTelefone(novoTelefone);
            System.out.println("Cliente atualizado com sucesso!");
        }
    }

    public void removerCliente(int id) {
        Cliente remover = buscarCliente(id);
        if (remover != null) {
            listaClientes.remove(remover);
            System.out.println("Cliente removido com sucesso!");
        }
    }
}
