import java.util.Random;

public class FabricaEmbaralhadores {
    public static Embaralhador create() {

        Embaralhador[] embaralhadorEscolhido = {
                new EmbaralhadorShuffle(),
                new EmbaralhadorReverso()
        };

        int indiceAleatorio = new Random().nextInt(embaralhadorEscolhido.length);

        return embaralhadorEscolhido[indiceAleatorio];
    }
}
