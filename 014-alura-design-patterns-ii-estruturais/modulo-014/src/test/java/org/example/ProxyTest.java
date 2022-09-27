package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.orcamento.ItemOrcamento;
import org.orcamento.Orcamento;
import org.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class ProxyTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProxyTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ProxyTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        OrcamentoProxy orcamentoProxy = new OrcamentoProxy(orcamento);

        assertEquals(
                BigDecimal.TEN,
                orcamentoProxy.getValor()
        );

        assertEquals(
                BigDecimal.TEN,
                orcamentoProxy.getValor()
        );
    }

}
