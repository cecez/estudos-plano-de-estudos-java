public class TestaMultiplosDe3 {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
        }

        for (int numero2 = 3; numero2 <= 100; numero2 += 3) {
            if (numero2 % 3 == 0) {
                System.out.println(numero2);
            }
        }

    }
}
