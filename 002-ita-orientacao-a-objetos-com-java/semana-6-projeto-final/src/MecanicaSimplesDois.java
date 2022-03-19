import java.util.Objects;

/**
 * 3 palavras
 * 3 tentativas por palavra
 */
public class MecanicaSimplesDois implements MecanicaDoJogo {

    String palavraOriginal;
    String palavraEmbaralhada;
    Embaralhador embaralhador;
    int tentativasRestantes;
    int palavrasRestantes;
    boolean acertouPalavra;
    boolean venceuJogo;

    MecanicaSimplesDois() {
        this.embaralhador = FabricaEmbaralhadores.create();
    }

    @Override
    public void comecaJogo() {
        this.palavrasRestantes = 3;
        this.venceuJogo = false;
        this.buscaPalavra();
    }

    private void buscaPalavra() {
        this.palavraOriginal = new BancoDePalavras().palavra();
        this.palavraEmbaralhada = this.embaralhador.embaralha(palavraOriginal);
        this.tentativasRestantes = 3;
        this.acertouPalavra = false;
    }

    @Override
    public String getPalavraEmbaralhada() {
        return this.palavraEmbaralhada;
    }

    @Override
    public String getPalavraOriginal() {
        return this.palavraOriginal;
    }

    @Override
    public boolean naoTerminou() {
        if (this.venceuJogo) {
            return false;
        }

        if (this.tentativasRestantes == 0) {
            return false;
        }

        return true;
    }

    @Override
    public void processaTentativa(String chute) {
        verificaSeAcertouChute(chute);
        verificaSeVenceuOJogo();
    }

    private void verificaSeAcertouChute(String chute) {
        if (Objects.equals(chute, this.palavraOriginal)) {
            this.acertouPalavra = true;
            this.palavrasRestantes--;
            this.buscaPalavra();
        } else {
            this.tentativasRestantes--;
        }
    }

    private void verificaSeVenceuOJogo() {
        if (this.palavrasRestantes == 0) {
            this.venceuJogo = true;
        }
    }

    @Override
    public String mensagemFinal() {

        if (this.venceuJogo) {
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
}
