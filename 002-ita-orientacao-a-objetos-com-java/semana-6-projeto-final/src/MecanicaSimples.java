/**
 * Deve retratar o andamento do jogo.
 * - jogo terminou? (após x tentativas, após x palavras,
 * - tentativas por palavras
 * - pontuação
 * - embaralhador utilizado e quando
 */

public class MecanicaSimples implements MecanicaDoJogo {

    String palavraOriginal;
    String palavraEmbaralhada;

    Embaralhador embaralhador;

    public MecanicaSimples() {
        this.embaralhador = FabricaEmbaralhadores.create();
    }

    @Override
    public String titulo() {
        return "Mecânica simples";
    }

    @Override
    public void comecaJogo() {
        this.palavraOriginal = new BancoDePalavras().palavra();
        this.palavraEmbaralhada = this.embaralhador.embaralha(palavraOriginal);

        System.out.println("A palavra embaralhada é: " + palavraEmbaralhada);
    }

    @Override
    public void terminaJogo() {
        System.out.println("A palavra original é: " + this.palavraOriginal);
    }


}
