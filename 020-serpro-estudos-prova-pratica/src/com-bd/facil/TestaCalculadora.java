
public class TestaCalculadora {
	
	public static void main(String[] args) {
		System.out.println("Testando calculadora");

		testaAdiciona();
	}

	public static void testaAdiciona() {
		System.out.println("Testando método adiciona");

		// arrange
		int op1 = 10, op2 = 20, retornoEsperado = 31;

		// act
		int retornoObtido = Calculadora.adicionar(op1, op2);

		// assert
		if (retornoObtido == retornoEsperado) {
			System.out.println("Teste OK");
		} else {
			System.out.println("Falha no teste");
		}
	}

}