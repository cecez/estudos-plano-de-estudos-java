/*
Enunciado: Desenvolva um sistema de registro de alunos em Java. O programa deve ser capaz de realizar as seguintes operações:

Exibir a lista completa de alunos registrados, com opções de filtragem por curso e ordenação por nome ou idade.

*/

import java.util.*;

public class Programa {
	public static void main(String[] args) {
		int indice = 0;
		Map<Integer, Aluno> alunos = new HashMap<>();
		alunos.put(indice++, new Aluno("Aluno", 10, "Curso"));
		alunos.put(indice++, new Aluno("Cluno", 11, "Burso"));
		alunos.put(indice++, new Aluno("Bluno", 12, "Aurso"));
		alunos.put(indice++, new Aluno("Aluno 2", 13, "urso"));
		alunos.put(indice++, new Aluno("Dluno", 14, "Curso"));
		alunos.put(100, new Aluno("Dluno", 100, "Curso"));

		alunos.forEach((i, aluno) -> {
			System.out.print("[" + i + "] - ");
			System.out.println(aluno);
		});

		Aluno alunoParaEditar = alunos.get(2);
		alunoParaEditar.setIdade(200);
		System.out.println(alunoParaEditar);

		alunos.remove(4);

		System.out.println(alunos);


		System.out.println("---stream----");
		alunos
			.entrySet()
			.stream()
			.filter(entrada -> entrada.getValue().getCurso() == "Curso")
			.sorted((e1, e2) -> {
				return e2.getValue().getIdade() - e1.getValue().getIdade();
			})
			.forEach(System.out::println);

		System.out.println("---hashmap final----");
		System.out.println(alunos);

	}
}