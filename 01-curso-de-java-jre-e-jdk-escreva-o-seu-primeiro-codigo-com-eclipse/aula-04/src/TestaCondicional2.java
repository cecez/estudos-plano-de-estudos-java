public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais 2");

        int idade = 20;
        int quantidadePessoas = 1;

        boolean acompanhado = (quantidadePessoas >= 2);
        boolean maiorDeIdade = (idade >= 18);

        if (maiorDeIdade || acompanhado) {
            System.out.println("olá permitido, seja bem-vindo.");
        } else {
            System.out.println("olá menor desacompanhado, adiós.");
        }
    }

}
