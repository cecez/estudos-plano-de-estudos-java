/*
Escrever linhas em um arquivo
ler linhas de um arquivo
*/

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Teste {
	public static void main(String[] args) throws IOException {
		//System.out.println("Escrevendo em um arquivo...");

		// FileWriter fw = new FileWriter("escrita.txt");
		// fw.write("Primeira linha");
		// fw.write(System.lineSeparator());
		// fw.write("Um dado: ");
		// fw.write("outro dado.");
		// fw.write(System.lineSeparator());
		// fw.write("fechando arquivo.");

		// fw.close();

		System.out.println("Lendo um arquivo...");

		Scanner scanner = new Scanner(new File("escrita.txt"), "UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}

		scanner.close();

	}
}