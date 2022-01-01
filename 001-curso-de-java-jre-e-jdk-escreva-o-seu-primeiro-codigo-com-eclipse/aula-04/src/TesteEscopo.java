public class TesteEscopo {

    public static void main(String[] args) {
        System.out.println("testando condicionais 2");

        int idade = 20;
        int quantidadePessoas = 1;

        boolean acompanhado;

        if (quantidadePessoas >= 2) {

            // gera erro pois variável já está definida no escopo
            //boolean acompanhado = true;

            acompanhado = true;
            boolean natimorta = true;
        } else {
            acompanhado = false;
            boolean natimorta = false;
        }

        // escopo da variável local natimorta é apenas dentro de seus ifs
        // System.out.println(natimorta);

        boolean maiorDeIdade = (idade >= 18);

        if (maiorDeIdade || acompanhado) {
            System.out.println("olá permitido, seja bem-vindo.");
        } else {
            System.out.println("olá menor desacompanhado, adiós.");
        }
    }

}
