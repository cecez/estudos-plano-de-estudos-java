import java.util.Scanner;

class Programa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int primeiroNumero = obtemNumero(scanner);
		System.out.println();
		int segundoNumero = obtemNumero(scanner);
		System.out.println();
		int resultado = primeiroNumero + segundoNumero;
		System.out.println("O resultado da soma dos números é: " + resultado);

		scanner.close();
	}

	private static Integer obtemNumero(Scanner scanner) {
		boolean numeroInvalido = true;
		Integer retorno = 0;

		while (numeroInvalido) {
			System.out.print("Digite um número inteiro: ");

			try {
				retorno = Integer.parseInt(scanner.nextLine());
				numeroInvalido = false;
			} catch (Exception e) {
				System.out.println("-- Número inteiro inválido.");
			}


			// String entrada = scanner.nextLine();
			// try {
			// 	retorno = Integer.valueOf(entrada);
			// 	numeroInvalido = false;
			// } catch (Exception e) {
			// 	System.out.println("-- Número inteiro inválido.");
			// }
		}

		return retorno;
	}
}