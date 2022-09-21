package org.imposto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class ImpostoDecorador {
    private final ImpostoDecorador outroImposto;

    public ImpostoDecorador(ImpostoDecorador outroImposto) {
        this.outroImposto = outroImposto;
    }
    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outroImposto != null) {
            valorOutroImposto = outroImposto.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorOutroImposto);
    }
}
