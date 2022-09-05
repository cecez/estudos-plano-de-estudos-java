package org.orcamento;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class Orcamento
{
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public Orcamento(BigDecimal valor) {
        this.valor = valor;
    }
}
