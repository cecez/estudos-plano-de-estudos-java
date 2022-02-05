import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class BarulhentoTest {

    @Test
    void principal() {
        Barulhento[] barulhadores = new Barulhento[5];

        barulhadores[0] = new Caminhao();
        barulhadores[1] = new Trompete();
        barulhadores[2] = new Gato();
        barulhadores[3] = new Caminhao();
        barulhadores[4] = new Gato();

        for(Barulhento b : barulhadores) {
            System.out.println(b.fazerBarulho());
        }
    }

}