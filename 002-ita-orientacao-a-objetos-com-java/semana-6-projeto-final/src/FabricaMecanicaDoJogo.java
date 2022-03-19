import java.util.Random;

public class FabricaMecanicaDoJogo {

    public static MecanicaDoJogo create() {

        MecanicaDoJogo[] mecanicaEscolhida = {
                new MecanicaSimples(),
                new MecanicaSimplesDois()
        };

        int indiceAleatorio = new Random().nextInt(mecanicaEscolhida.length);

        return mecanicaEscolhida[indiceAleatorio];
    }
}
