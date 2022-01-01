public class TestaLacos {

    public static void main(String[] args) {
        int contador = 0;
        int total = 0;

        // while
        while (contador <= 10) {
            total += contador;
            contador++;
        }

        System.out.println("Somatório até " + (contador-1) + " é igual a " + total);

        // for
        for (int contador2 = 0; contador2 <= 10; contador2++) {
            System.out.println(contador2);
        }
        // contador2 não existe aqui devido ao escopo

        // for 2
        for (int linha = 0; linha <= 10; linha++) {
            System.out.print("Linha " + linha + " ");
            for (int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
