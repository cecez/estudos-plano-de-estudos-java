package org.orcamento.situacao;

import org.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends Situacao
{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
