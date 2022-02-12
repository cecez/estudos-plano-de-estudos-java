import java.util.Scanner;

/**
 * Representa a classe com o método main().
 * É essa classe responsável por ler a entrada do usuário e por imprimir as informações no console.
 * Nenhuma outra classe pode imprimir ou ler do console.
 */

public class Principal {

    public static void main(String[] args) {
        System.out.println("Que comece o jogo das palavras embaralhadas!");

        // leitura do console
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeDoJogador = entrada.nextLine();
        System.out.println("Bom jogo " + nomeDoJogador + "!");



        // recuperar instância de MecanicaDoJogo da Fabrica
        // MecanicaDoJogo mecanica = FabricaMecanicaDoJogo::factory();
    }

}
