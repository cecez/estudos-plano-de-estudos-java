package org.pedido;

import org.orcamento.ItemOrcamento;
import org.orcamento.Orcamento;
import org.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private final List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new ItemOrcamento(dados.getValorOrcamento()));
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));
    }
}
