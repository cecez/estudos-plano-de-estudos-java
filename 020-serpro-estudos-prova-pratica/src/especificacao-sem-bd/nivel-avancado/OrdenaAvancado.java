/*
Nível Avançado:

Exercício: Crie um programa que leia um grande arquivo de palavras (uma palavra por linha) e crie um histograma de frequência das palavras. O histograma deve ser organizado em ordem decrescente de frequência. Exiba as palavras e suas frequências.
*/

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenaAvancado {
	public static void main(String[] args) throws FileNotFoundException {
		// ler arquivo e criar histograma de frequência
		Scanner scanner = new Scanner(new File("palavras.txt"), "UTF-8");
		Map<String, Integer> histograma = new HashMap<>();


		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			if (histograma.containsKey(linha)) {
				Integer contador = histograma.get(linha) + 1;
				histograma.put(linha, contador);
			} else {
				histograma.put(linha, 1);
			}
		}

		scanner.close();

		List<String> palavrass = histograma
			.entrySet()
			.stream()
			.sorted((p1, p2) -> p2.getValue() - p1.getValue())
			.map(e -> e.getKey())
			.collect(Collectors.toList());

		System.out.println(palavrass);
	}
}