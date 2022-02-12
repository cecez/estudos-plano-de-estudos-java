import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BancoDePalavrasTest {

    @Test
    void palavraValida() {
        // arrange
        BancoDePalavras bancoDePalavras = new BancoDePalavras();

        // act
        String palavra = bancoDePalavras.palavra();

        // assert
        assertFalse(palavra.isBlank());
        assertTrue(palavra.length() >= 2);
    }

    @Test
    void palavraExisteNoBancoDePalavras() {
        // arrange
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        // carrega banco
        String[] bancoDePalavrasDoArquivo = this.carregaBanco();
        System.out.println(Arrays.toString(bancoDePalavrasDoArquivo));

        // act
        String palavra = bancoDePalavras.palavra();

        // assert
        // palavra deve estar no banco

    }

    public String[] carregaBanco() {

        // lê quantas linhas tem no arquivo
        Path file = Paths.get("/Users/cezarcastrorosa/IdeaProjects/estudos-plano-de-estudos-java/002-ita-orientacao-a-objetos-com-java/semana-6-projeto-final/src/palavras.txt");
        int linhas = 0;
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            while (reader.readLine() != null) {
                linhas++;
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        // cria array
        String[] banco = new String[linhas];

        // adiciona palavras no array
        linhas = 0;
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                banco[linhas++] = line;
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return banco;
    }


}