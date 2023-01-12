package br.com.cecez;

public class MeuJson {
    private final int inteiro = 20;
    private final String corda = "minha corda";
    MeuJson() {}

    @Override
    public String toString() {
        return "inteiro: " + inteiro + ", corda: " + corda;
    }
}
