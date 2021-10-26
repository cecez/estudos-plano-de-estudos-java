import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TesteProjeto {

    public static final String OPCAO_SAIR = "1";
    public static final String OPCAO_CADASTRAR = "2";
    public static final String OPCAO_LISTAR = "5";

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Digite seu nome: ");
        String str = sc.nextLine();              //reads string
        System.out.println("Olá " + str);

        System.out.println("Bem-vindo ao sisteminha para cadastro de tarefas (SPCT)");

        String opcao;
        ArrayList<String> tarefas = new ArrayList<String>();
        do {
            System.out.println("***********************************");
            System.out.println("Opções disponíveis: (1) Sair do sistema (2) Cadastrar tarefa (3) Concluir tarefa (4) Excluir tarefa (5) Listar tarefas");
            System.out.println("***********************************");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case OPCAO_SAIR -> System.out.println("Você escolheu sair, adeus.");
                case OPCAO_CADASTRAR -> {
                    System.out.print("Digite o nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();
                    tarefas.add(nomeTarefa);
                }
                case OPCAO_LISTAR -> {
                    System.out.println("Listando tarefas:");
                    if (tarefas.size() == 0) {
                        System.out.println("Sem tarefas cadastradas");
                        break;
                    }
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("[ ] " + i + ". " + tarefas.get(i));
                    }
                }
                default -> System.out.println("Opção não existente. Tente novamente.");
            }

            // TODO limpar tela


        } while (!Objects.equals(opcao, OPCAO_SAIR));

        System.out.println("Fechando programa.");


    }
}
