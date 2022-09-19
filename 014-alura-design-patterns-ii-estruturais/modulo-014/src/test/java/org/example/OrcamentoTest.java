package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.desconto.CalculadoraDeDescontos;
import org.imposto.CalculadoraDeImpostos;
import org.imposto.ICMS;
import org.orcamento.Orcamento;
import org.pedido.GeraPedido;
import org.pedido.GeraPedidoHandler;
import org.pedido.acao.EnviarEmail;
import org.pedido.acao.SalvaNoBD;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class OrcamentoTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public OrcamentoTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( OrcamentoTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Orcamento orcamento = new Orcamento(new BigDecimal("20"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

//        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
    }

    public void test_desconto()
    {
        // > 5 itens
        Orcamento orcamento = new Orcamento(new BigDecimal("20"), 10);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        assertEquals(new BigDecimal("2.00"), calculadoraDeDescontos.calcular(orcamento));

        // < 5 itens
        orcamento = new Orcamento(new BigDecimal("20"), 2);
        calculadoraDeDescontos = new CalculadoraDeDescontos();

        assertEquals(BigDecimal.ZERO, calculadoraDeDescontos.calcular(orcamento));

        // > R$ 500
        orcamento = new Orcamento(new BigDecimal("600"), 1);
        calculadoraDeDescontos = new CalculadoraDeDescontos();

        assertEquals(new BigDecimal("60.00"), calculadoraDeDescontos.calcular(orcamento));

        // < R$ 500
        orcamento = new Orcamento(new BigDecimal("100"), 1);
        calculadoraDeDescontos = new CalculadoraDeDescontos();

        assertEquals(BigDecimal.ZERO, calculadoraDeDescontos.calcular(orcamento));
    }

    public void test_pedido() {
        GeraPedido geraPedido = new GeraPedido("Cliente A", new BigDecimal("200.00"), 10);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
            Arrays.asList(new SalvaNoBD(), new EnviarEmail())
        );
        geraPedidoHandler.executa(geraPedido);


    }

}
