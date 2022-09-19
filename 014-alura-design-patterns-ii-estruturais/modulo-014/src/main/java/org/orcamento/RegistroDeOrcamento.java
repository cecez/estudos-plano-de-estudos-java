package org.orcamento;

import org.loja.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) throws Exception {
        if (!orcamento.isFinalizado()) {
            throw new Exception("Orcamento precisa estar finalizado para ser registrado.");
        }

        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeDeItens()
        );
        this.httpAdapter.post("http://api.com/", dados);
    }
}
