public class TesteFatorial {

    public static void main(String[] args) {

        System.out.println("Versão com 2 laços:");
        for (int n = 1; n <= 10 ; n++) {
            int fatorial = 1;

            for (int m = 1; m <= n; m++) {
                fatorial = fatorial * m;
            }

            System.out.println("O fatorial de " + n + " é " + fatorial);
        }

        System.out.println("Versão com 1 laço, aproveitando resultado anterior:");
        int fatorial2 = 1;
        for (int o = 1; o <= 10; o++) {
            fatorial2 = fatorial2 * o;

            System.out.println("O fatorial de " + o + " é " + fatorial2);
        }

    }

}
