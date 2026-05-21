package controle;

import java.util.ArrayList;
import model.Cliente;

public class ClienteControle {

    public static ArrayList<Cliente> listaClientes =
            new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {

        listaClientes.add(cliente);

        System.out.println("Cliente cadastrado!");
    }

    public void listarClientes() {

        for (Cliente c : listaClientes) {

            System.out.println(
                    c.getId() + " | "
                    + c.getNome() + " | "
                    + c.getTelefone()
            );
        }
    }
}