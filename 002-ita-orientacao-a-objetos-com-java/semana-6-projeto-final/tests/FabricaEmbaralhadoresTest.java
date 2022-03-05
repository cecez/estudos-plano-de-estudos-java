import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FabricaEmbaralhadoresTest {

    @Test
    public void testEmbaralhadorValido() {
        // arrange e act
        Embaralhador embaralhadorEscolhido = FabricaEmbaralhadores.create();

        // assert
        assertNotNull(embaralhadorEscolhido);
    }

}
