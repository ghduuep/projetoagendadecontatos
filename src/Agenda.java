import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> listaDeContatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        listaDeContatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void removerContato(String nome) {
        for(Contato contato : listaDeContatos) {
            if(contato.getNome().equals(nome)) {
                listaDeContatos.remove(contato);
                System.out.println("Contato removido com sucesso!");
                break;
            }
            System.out.println("Contato não encontrado!");

        }
    }

    public void listarContatos() {
        System.out.println("Lista de contatos adicionados:");
        for (Contato c : listaDeContatos) {
            System.out.println(c.getNome());
        }
        if (listaDeContatos.isEmpty()) {
            System.out.println("Agenda de contatos vazia");
        }
    }
}
