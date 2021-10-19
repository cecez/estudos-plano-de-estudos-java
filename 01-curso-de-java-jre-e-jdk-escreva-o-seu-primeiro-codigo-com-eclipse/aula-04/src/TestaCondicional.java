public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 11;
        int quantidadePessoas = 1;

        if (idade >= 18) {
            System.out.println("olá maioral, seja bem-vindo.");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("olá menor acompanhado, welcome.");
            } else {
                System.out.println("olá menor desacompanhado, adiós.");
            }
        }
    }

}
