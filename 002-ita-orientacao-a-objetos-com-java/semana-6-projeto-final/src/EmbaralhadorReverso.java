/**
 * Implementação/Algoritmos para embaralhamento de palavra (ex: inverter string, trocar letras, etc)
 */

public class EmbaralhadorReverso implements Embaralhador {

    @Override
    public String embaralha(String palavraOriginal) {
        StringBuilder palavra = new StringBuilder(palavraOriginal);
        return palavra.reverse().toString();
    }
}
