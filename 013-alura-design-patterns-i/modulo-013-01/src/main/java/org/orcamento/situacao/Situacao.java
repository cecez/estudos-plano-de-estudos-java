package org.orcamento.situacao;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Situacao {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orcamento nao pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orcamento nao pode ser finalizado!");
    }
}
