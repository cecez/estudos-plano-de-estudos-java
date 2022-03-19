import java.util.Scanner;

/**
 * Representa a classe com o método main().
 * É essa classe responsável por ler a entrada do usuário e por imprimir as informações no console.
 * Nenhuma outra classe pode imprimir ou ler do console.
 */

public class Principal {

    public static void main(String[] args) {
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.create();

        boasVindas();

        mecanica.comecaJogo();
        while (mecanica.naoTerminou()) {
            // talvez colocar um imprimeMensagem(mecanica.mensagemAntesDoChute());
            imprimePalavraEmbaralhada(mecanica.getPalavraEmbaralhada());
            String chute = obtemChute();
            System.out.println("Processando tentativa com " + chute);
            mecanica.processaTentativa(chute);
        }
        imprimeMensagemFinal(mecanica.mensagemFinal());

        System.out.println("A palavra original é:");
        System.out.println(mecanica.getPalavraOriginal());
    }

    private static String obtemChute() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu chute: ");
        return entrada.nextLine();
    }

    private static void imprimePalavraEmbaralhada(String palavraEmbaralhada) {
        System.out.println("************************");
        System.out.println("* Palavra embaralhada: *");
        System.out.println("* " + palavraEmbaralhada);
        System.out.println("************************");
    }

    private static void imprimeMensagemFinal(String mensagem) {
        System.out.println(mensagem);
    }

    private static void boasVindas() {

        System.out.println("Que comece o jogo das palavras embaralhadas!");

        // leitura do console
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nomeDoJogador = entrada.nextLine();
        System.out.println("Bom jogo " + nomeDoJogador + "!");
    }

}
