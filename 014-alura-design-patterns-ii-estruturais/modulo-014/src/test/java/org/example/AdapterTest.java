package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.loja.JavaHttpAdapter;
import org.orcamento.ItemOrcamento;
import org.orcamento.Orcamento;
import org.orcamento.RegistroDeOrcamento;
import java.math.BigDecimal;

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
        Orcamento orcamento = new Orcamento();
        orcamento.adicionaItem(new ItemOrcamento(BigDecimal.TEN));
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
