package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.desconto.CalculadoraDeDescontos;
import org.imposto.CalculadoraDeImpostos;
import org.imposto.ICMS;
import org.imposto.TipoImposto;
import org.orcamento.Orcamento;

import java.math.BigDecimal;

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

}
