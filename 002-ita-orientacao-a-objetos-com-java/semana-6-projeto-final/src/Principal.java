import java.util.Scanner;

/**
 * Representa a classe com o método main().
 * É essa classe responsável por ler a entrada do usuário e por imprimir as informações no console.
 * Nenhuma outra classe pode imprimir ou ler do console.
 */

public class Principal {

    public static void main(String[] args) {
        System.out.println("Que comece o jogo das palavras embaralhadas!");

        boasVindas();

        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.create();
        System.out.println("Jogando com a " + mecanica.titulo());
        mecanica.comecaJogo();
        System.out.println("Palavra embaralhada:");
        System.out.println(mecanica.getPalavraEmbaralhada());

        // while mecanica.naoTerminou() { processaTentativa(); }

        mecanica.terminaJogo();
        System.out.println("A palavra original é:");
        System.out.println(mecanica.getPalavraOriginal());
    }

    private static void boasVindas() {
        // leitura do console
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeDoJogador = entrada.nextLine();
        System.out.println("Bom jogo " + nomeDoJogador + "!");
    }

}
