import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroMultiplicadorTest {

    CarroMultiplicador carroMultiplicador;

    @BeforeEach
    public void antesDeCadaMetodo()
    {
        this.carroMultiplicador = new CarroMultiplicador("MultiCarr", 300, 1.8);
    }

    @AfterEach
    public void depoisDeCadaMetodo()
    {
        this.carroMultiplicador = null;
    }

    @Test
    public void testVelocidadeInicial()
    {
        assertEquals(0, this.carroMultiplicador.getVelocidade());
    }

    @Test
    public void testAcelerar()
    {
        this.carroMultiplicador.acelerar();

        assertEquals(10, this.carroMultiplicador.getVelocidade());
    }

    @Test
    public void testAcelerarDuasVezes()
    {
        this.carroMultiplicador.acelerar();
        this.carroMultiplicador.acelerar();

        assertEquals(18, this.carroMultiplicador.getVelocidade());
    }

    @Test
    public void testFrear() {
        carroMultiplicador.acelerar(); // 10
        carroMultiplicador.frear(); // 5

        assertEquals(5, carroMultiplicador.getVelocidade());
    }

    @Test
    public void testAcelerarAteVelocidadeMaxima() {
        for (int i=1; i<=40; i++) {
            carroMultiplicador.acelerar();
        }

        assertEquals(carroMultiplicador.getVelocidadeMaxima(), carroMultiplicador.getVelocidade());
    }

}