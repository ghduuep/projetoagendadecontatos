import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nBem-vindo(a) à agenda de contatos");
            System.out.println("""
                \n1 - Adicionar contato
                2 - Remover contato
                3 - Listar contatos
                4 - sair""");
            System.out.println("\nDigite a opção escolhida: ");
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Qual o nome do contato que deseja adicionar?");
                String nome = leitura.next();
                System.out.println("Qual o número de telefone dessa pessoa?");
                String numero = leitura.next();
                Contato contato = new Contato(nome, numero);
                agenda.adicionarContato(contato);
            } else if (opcao == 2) {
                System.out.println("Qual o nome da pessoa que você deseja remover?");
                String nome = leitura.next();
                agenda.removerContato(nome);
            } else if (opcao == 3) {
                agenda.listarContatos();
            }
        }

        System.out.println("Finalizando...");



    }
}
