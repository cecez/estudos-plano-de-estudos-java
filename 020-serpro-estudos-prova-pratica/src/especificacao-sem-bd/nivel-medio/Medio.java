/*
O programa deve permitir que o usuário execute as seguintes operações:

Adicionar uma nova tarefa à lista.
Marcar uma tarefa como concluída.
Exibir a lista de tarefas pendentes e concluídas.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Medio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean terminou = false;
		Random random = new Random();
		List<Tarefa> listaDeTarefas = new ArrayList<Tarefa>();
		listaDeTarefas.add(new Tarefa("teste 1"));
		listaDeTarefas.add(new Tarefa("teste 2"));
		listaDeTarefas.add(new Tarefa("teste 3"));
		listaDeTarefas.add(new Tarefa("teste 11"));
		listaDeTarefas.add(new Tarefa("teste 12"));

		while (!terminou) {
			System.out.println("O que você deseja fazer?");
			System.out.println("------------------------");
			System.out.println("1 - Adicionar nova tarefa");
			System.out.println("2 - Marcar uma tarefa como concluída");
			System.out.println("3 - Exibir lista de tarefas");
			System.out.println("---------------------------");
			System.out.println("4 - Sair do programa");
			
			int opcaoDesejada = obterOpcao(scanner);

			switch (opcaoDesejada) {
			case 1:
				System.out.println("Adicionando tarefa");
				listaDeTarefas.add(new Tarefa("nova tarefa - " + random.nextInt(100)));
				break;
			case 2:
				System.out.println("Concluindo tarefa");
				for (Tarefa t : listaDeTarefas) {
					if (t.titulo() == "teste 11") {
						t.concluir();
					}
				}
				break;
			case 3:
				System.out.println("Listando tarefas");
				for (Tarefa t : listaDeTarefas) {
					System.out.println(t);
				}
				break;
			case 4:
				terminou = true;
				break;
			}
		}

		scanner.close();
		System.out.println("Fim do programa.");
	}

	public static int obterOpcao(Scanner scanner) {
		boolean opcaoInvalida = true;
		int opcaoDesejada = 0;

		while (opcaoInvalida) {
			System.out.print("> ");
			try {
				opcaoDesejada = Integer.parseInt(scanner.nextLine());
				opcaoInvalida = false;
			} catch (Exception e) {
				System.out.println("-- Opção inválida. Tente novamente.");
			}

		}
		return opcaoDesejada;
	}
}