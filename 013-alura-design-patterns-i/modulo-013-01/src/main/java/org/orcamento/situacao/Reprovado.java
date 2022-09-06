package org.orcamento.situacao;

import org.orcamento.Orcamento;

public class Reprovado extends Situacao {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
