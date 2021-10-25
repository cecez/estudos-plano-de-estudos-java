import java.util.Objects;
import java.util.Scanner;

public class TesteProjeto {

    public static final String OPCAO_SAIR = "1";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Digite seu nome: ");
        String str = sc.nextLine();              //reads string
        System.out.println("Olá " + str);

        System.out.println("Bem-vindo ao sisteminha para cadastro de tarefas (SPCT)");
        System.out.println("Opções disponíveis: (1) Sair do sistema (2) Cadastrar tarefa (3) Concluir tarefa (4) Excluir tarefa (5) Listar tarefas");

        String opcao;
        do {
            System.out.print("Digite uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case OPCAO_SAIR:
                    System.out.println("Você escolheu sair, adeus.");
                    break;
                default:
                    System.out.println("Opção não existente. Tente novamente.");
            }

        } while (!Objects.equals(opcao, OPCAO_SAIR));

        System.out.println("Fechando programa.");


    }
}
