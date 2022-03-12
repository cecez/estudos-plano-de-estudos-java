public interface MecanicaDoJogo {
    void comecaJogo();
    String getPalavraEmbaralhada();
    String getPalavraOriginal();
    boolean naoTerminou();
    void processaTentativa(String chute);
    String mensagemFinal();
}
