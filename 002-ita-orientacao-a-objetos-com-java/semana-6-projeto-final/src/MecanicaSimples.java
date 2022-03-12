import java.util.Objects;

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
    int tentativasRestantes;
    boolean acertou;


    public MecanicaSimples() {
        this.embaralhador = FabricaEmbaralhadores.create();
    }

    @Override
    public String getPalavraEmbaralhada() {
        return palavraEmbaralhada;
    }

    @Override
    public String getPalavraOriginal() {
        return palavraOriginal;
    }

    @Override
    public void comecaJogo() {
        this.palavraOriginal = new BancoDePalavras().palavra();
        this.palavraEmbaralhada = this.embaralhador.embaralha(palavraOriginal);
        this.tentativasRestantes = 5;
        this.acertou = false;
    }

    @Override
    public boolean naoTerminou() {
        return this.temTentativas() && !this.acertou;
    }

    @Override
    public void processaTentativa(String chute) {
        this.decrementaTentativas();
        this.confereTentativa(chute);
    }

    @Override
    public String mensagemFinal() {

        if (this.acertou) {
            return this.mensagemDaVitoria();
        } else {
            return this.mensagemDaDerrota();
        }

    }

    private String mensagemDaVitoria() {
        return "PARABEEEEEEEEEENS!";
    }

    private String mensagemDaDerrota() {
        return "QUE PENA, TENTE NOVAMENTE!";
    }

    private void decrementaTentativas() {
        this.tentativasRestantes = this.tentativasRestantes - 1;
    }

    private void confereTentativa(String chute) {
        if (Objects.equals(chute, this.palavraOriginal)) {
            this.acertou = true;
        }
    }

    private boolean temTentativas() {
        return this.tentativasRestantes != 0;
    }


}
