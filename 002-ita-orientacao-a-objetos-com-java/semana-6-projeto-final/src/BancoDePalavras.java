import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Classe que possui um método que retorna uma palavra retirada
 * aleatoriamente de uma lista de palavras lida a partir de um arquivo.
 */

public class BancoDePalavras {

    private final Set<String> bancoDePalavras = new HashSet<>();

    public BancoDePalavras() {
        this.carregaPalavrasDoArquivoParaBancoDePalavras();
    }

    private void carregaPalavrasDoArquivoParaBancoDePalavras() {
        Path file = Paths.get("/Users/cezarcastrorosa/IdeaProjects/estudos-plano-de-estudos-java/002-ita-orientacao-a-objetos-com-java/semana-6-projeto-final/src/palavras.txt");

        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                bancoDePalavras.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    public String palavra() {

        String palavraEscolhida = this.palavraSorteada();
        this.removePalavra(palavraEscolhida);

        return palavraEscolhida;
    }

    private String palavraSorteada() {
        String palavraEscolhida = null;

        // sorteia uma palavra
        int tamanho = bancoDePalavras.size();
        int indice = new Random().nextInt(tamanho);
        int iterador = 0;
        for (String palavraIterada : bancoDePalavras) {
            if (iterador == indice) {
                palavraEscolhida = palavraIterada;
            }
            iterador++;
        }

        return palavraEscolhida;
    }

    private void removePalavra(String palavra) {
        this.bancoDePalavras.remove(palavra);
    }

}
