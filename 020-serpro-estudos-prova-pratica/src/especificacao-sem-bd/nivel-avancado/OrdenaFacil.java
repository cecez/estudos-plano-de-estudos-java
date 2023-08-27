/*

Exercício: Crie um programa que solicite ao usuário que insira cinco números inteiros e, em seguida, exiba esses números em ordem crescente.

*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenaFacil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insira 5 números inteiros separados por espaço: ");

		String linha = scanner.nextLine();
		String[] numerosDigitados = linha.split(" ");

		List<Integer> numeros = new ArrayList<>();
		for (String s : numerosDigitados) {
			numeros.add(Integer.parseInt(s));
		}

		Collections.sort(numeros);
		Collections.reverse(numeros);

		System.out.println(numeros);
	}
}