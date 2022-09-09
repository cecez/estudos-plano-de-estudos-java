package org.pedido;

import org.orcamento.Orcamento;
import org.pedido.acao.AcaoAposGerarPedido;
import org.pedido.acao.EnviarEmail;
import org.pedido.acao.SalvaNoBD;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private final List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));
    }
}
