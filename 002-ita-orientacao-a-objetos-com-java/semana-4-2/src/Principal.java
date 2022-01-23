public class Principal {

    public static void main(String[] args) {
        Corrida corridaJaveira = new Corrida(42195);

        corridaJaveira.adicionaCarro(new CarroSoma(20, 200, "Somador20-200"));
        corridaJaveira.adicionaCarro(new CarroSoma(10, 300, "Somador10-300"));
        corridaJaveira.adicionaCarro(new CarroSoma(5, 400, "Somador5-400"));

        corridaJaveira.adicionaCarro(new CarroMultiplicador("Multiplicator300-1.1", 300, 1.1));
        corridaJaveira.adicionaCarro(new CarroMultiplicador("Multiplicator100-1.5", 100, 1.5));
        corridaJaveira.adicionaCarro(new CarroMultiplicador("Multiplicator200-2.1", 200, 2.1));

        corridaJaveira.comecaCorrida();
    }

}
