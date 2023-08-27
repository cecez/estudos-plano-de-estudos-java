/*
Nível Médio:

Exercício: Crie um programa que leia informações de várias pessoas (como nome e idade) e armazene-as em um ArrayList. Em seguida, ordene a lista com base nas idades das pessoas e exiba as informações ordenadas.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenaMedio {
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("asd", 11, "ccc"));
		alunos.add(new Aluno("asd", 10, "ccc"));
		alunos.add(new Aluno("asd", 21, "ccc"));
		alunos.add(new Aluno("asd", 51, "ccc"));
		alunos.add(new Aluno("asd", 41, "ccc"));
		alunos.add(new Aluno("asd", 1, "ccc"));
		alunos.add(new Aluno("asd", 21, "ccc"));

		Collections.sort(alunos, (a1, a2) -> {
			if (a1.getIdade() > a2.getIdade()) return 1;
			if (a1.getIdade() < a2.getIdade()) return -1;
			return 0;
		});

		alunos.forEach(System.out::println);

	}
}