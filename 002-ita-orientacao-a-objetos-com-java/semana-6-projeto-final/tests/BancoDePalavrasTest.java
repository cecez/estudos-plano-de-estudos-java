import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BancoDePalavrasTest {

    @Test
    protected void palavraValida() {
        // arrange
        BancoDePalavras bancoDePalavras = new BancoDePalavras();

        // act
        String palavra = bancoDePalavras.palavra();

        // assert
        assertFalse(palavra.isBlank());
        assertTrue(palavra.length() >= 2);
        System.out.println(palavra);
    }

    @Test
    protected void palavraExisteNoBancoDePalavras() {
        // arrange
        BancoDePalavras bancoDePalavras = new BancoDePalavras();
        Set<String> bancoDePalavrasDoArquivo = this.carregaBanco();

        // act
        String palavra = bancoDePalavras.palavra();

        // assert
        // palavra deve estar no banco
        assertTrue(bancoDePalavrasDoArquivo.contains(palavra));
        System.out.println(palavra);
    }

    private Set<String> carregaBanco() {

        Set<String> bancoDePalavras = new HashSet<>();

        Path file = Paths.get("/Users/cezarcastrorosa/IdeaProjects/estudos-plano-de-estudos-java/002-ita-orientacao-a-objetos-com-java/semana-6-projeto-final/src/palavras.txt");

        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                bancoDePalavras.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }

        return bancoDePalavras;
    }


}