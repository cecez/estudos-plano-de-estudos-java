import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Tarefa
{
    public String titulo;
    public boolean concluida;
}

class Util
{
    public static void limpaTela() {
        for (int i = 0; i < 100; ++i)
            System.out.println();
    }
}

public class TesteProjeto {

    public static final String OPCAO_SAIR = "1";
    public static final String OPCAO_CADASTRAR = "2";
    public static final String OPCAO_CONCLUIR = "3";
    public static final String OPCAO_EXCLUIR = "4";

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Digite seu nome: ");
        String str = sc.nextLine();              //reads string
        System.out.println("Olá " + str);

        System.out.println("Bem-vindo ao sisteminha para cadastro de tarefas (SPCT)");

        String opcao;
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        do {
            System.out.println("***********************************");
            System.out.println("Opções disponíveis: (1) Sair do sistema (2) Cadastrar tarefa (3) Concluir tarefa (4) Excluir tarefa");
            System.out.println("***********************************");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextLine();

            switch (opcao) {
                case OPCAO_SAIR -> System.out.println("Você escolheu sair, adeus.");
                case OPCAO_CADASTRAR -> {
                    System.out.print("Digite o nome da tarefa: ");
                    String nomeTarefa = sc.nextLine();

                    Tarefa tarefa = new Tarefa();
                    tarefa.titulo = nomeTarefa;
                    tarefa.concluida = false;

                    tarefas.add(tarefa);
                }
                case OPCAO_CONCLUIR -> {
                    System.out.print("Digite o identificador da tarefa: ");
                    int idTarefa = Integer.parseInt(sc.nextLine());

                    try {
                        // buscar, conclui e atualiza tarefa
                        Tarefa tarefa = tarefas.get(idTarefa);
                        tarefa.concluida = true;
                        tarefas.set(idTarefa, tarefa);
                    } catch (Exception e) {
                        System.out.println("Tarefa não encontrada");
                    }


                }
                case OPCAO_EXCLUIR -> {
                    System.out.print("Digite o identificador da tarefa: ");
                    int idTarefa = Integer.parseInt(sc.nextLine());

                    try {
                        tarefas.remove(idTarefa);
                    } catch (Exception e) {
                        System.out.println("Tarefa não encontrada");
                    }
                }
                default -> System.out.println("Opção não existente. Tente novamente.");
            }

            Util.limpaTela();

            // Listando tarefas
            System.out.println("Listando tarefas:");
            if (tarefas.size() == 0) {
                System.out.println("Sem tarefas cadastradas");
            } else {
                for (int i = 0; i < tarefas.size(); i++) {
                    Tarefa tarefa = tarefas.get(i);

                    System.out.print("[");
                    if (tarefa.concluida) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                    System.out.print("] ");

                    System.out.println(i + ". " + tarefas.get(i).titulo);
                }
            }


        } while (!Objects.equals(opcao, OPCAO_SAIR));

        System.out.println("Fechando programa.");


    }
}
