import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarroSomaTest {

    CarroSoma carroSoma;

    @BeforeEach
    public void antesDeCadaMetodo()
    {
        this.carroSoma = new CarroSoma(10, 200, "TestCarr");
    }

    @AfterEach
    public void depoisDeCadaMetodo()
    {
        this.carroSoma = null;
    }

    @Test
    public void testVelocidadeInicial()
    {
        assertEquals(0, this.carroSoma.getVelocidade());
    }

    @Test
    public void testAcelerar()
    {
        this.carroSoma.acelerar();

        assertEquals(10, this.carroSoma.getVelocidade());
    }

    @Test
    public void testFrear() {
        carroSoma.acelerar(); // 10
        carroSoma.frear(); // 5

        assertEquals(5, carroSoma.getVelocidade());
    }

    @Test
    public void testAcelerarAteVelocidadeMaxima() {
        for (int i=1; i<=40; i++) {
            carroSoma.acelerar();
        }

        assertEquals(carroSoma.getVelocidadeMaxima(), carroSoma.getVelocidade());
    }
}