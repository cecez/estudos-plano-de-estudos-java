import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro;

    @BeforeAll
    public static void antesDeTudo()
    {
        System.out.println("BeforeAll: vamos começar.");
    }

    @BeforeEach
    public void antesDeCadaMetodo()
    {
        System.out.println("BeforeEach: fui chamado.");
        this.carro = new Carro();
        this.carro.potencia = 10;
    }

    @AfterEach
    public void depoisDeCadaMetodo()
    {
        System.out.println("AfterEach: fui chamado.");
        this.carro = null;
    }

    @AfterAll
    public static void depoisDeTudo()
    {
        System.out.println("AfterAll: obrigado a todos.");
    }

    @Test
    public void testVelocidadeInicial()
    {
        assertEquals(0, this.carro.velocidade);
    }

    @Test
    public void testAcelerar()
    {
        this.carro.acelerar();

        assertEquals(10, this.carro.velocidade);
    }

}