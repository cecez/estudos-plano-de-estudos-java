public class TestaCaracteres {

    public static void main(String[] args) {
        // deve ser aspas simples
        char letra = 'a';

        String palavra = "deve ser aspas dupla";

        System.out.println(letra);
        System.out.println(palavra);

        letra = (char) (letra + 1);
        System.out.println(letra);
    }

}
