import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorShuffle implements Embaralhador {

    @Override
    public String embaralha(String palavraOriginal) {

        char[] caracteres = palavraOriginal.toCharArray();

        List<Character> listaDeCaracteres = new ArrayList<>();

        for (Character caractere : caracteres) {
            listaDeCaracteres.add(caractere);
        }

        Collections.shuffle(listaDeCaracteres);

        StringBuilder stringBuilder = new StringBuilder();

        for (Character caractere : listaDeCaracteres) {
            stringBuilder.append(caractere);
        }

        return stringBuilder.toString();
    }
}
