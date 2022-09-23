package org.orcamento;

import org.orcamento.situacao.EmAnalise;
import org.orcamento.situacao.Finalizado;
import org.orcamento.situacao.Situacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel
{
    private BigDecimal valor;
    private Situacao situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeDeItens() {
        return itens.size();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

    public void adicionaItem(Orcavel itemOrcavel) {
        this.valor = this.valor.add(itemOrcavel.getValor());
        this.itens.add(itemOrcavel);
    }
}
