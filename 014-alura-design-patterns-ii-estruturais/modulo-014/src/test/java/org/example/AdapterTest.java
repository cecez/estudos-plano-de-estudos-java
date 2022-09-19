package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.desconto.CalculadoraDeDescontos;
import org.imposto.CalculadoraDeImpostos;
import org.imposto.ICMS;
import org.loja.JavaHttpAdapter;
import org.orcamento.Orcamento;
import org.orcamento.RegistroDeOrcamento;
import org.pedido.GeraPedido;
import org.pedido.GeraPedidoHandler;
import org.pedido.acao.EnviarEmail;
import org.pedido.acao.SalvaNoBD;

import java.math.BigDecimal;
import java.util.Arrays;

public class AdapterTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AdapterTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AdapterTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(
                new JavaHttpAdapter()
        );
        try {
            registroDeOrcamento.registrar(orcamento);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
