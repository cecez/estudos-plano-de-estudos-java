package org.imposto;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
}
