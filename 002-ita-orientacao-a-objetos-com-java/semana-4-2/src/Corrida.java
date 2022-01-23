import java.util.HashMap;
import java.util.Map;

public class Corrida
{
    private int distanciaDaPista;
    private Map<CarroDeCorrida, Integer> carros = new HashMap<>();

    public Corrida(int distanciaDaPista) {
        this.distanciaDaPista = distanciaDaPista;
    }

    public void adicionaCarro(CarroDeCorrida carro) {
        this.carros.put(carro, 0);
    }

    public void comecaCorrida() {
        while (!corridaTerminou()) {
            for (CarroDeCorrida carroCorredor : carros.keySet()) {
                carroCorredor.acelerar();
                int distancia = carros.get(carroCorredor);
                distancia += carroCorredor.getVelocidade();
                carros.put(carroCorredor, distancia);
            }
        }

        for (CarroDeCorrida carroCorredor : carros.keySet()) {
            System.out.println(carroCorredor.getNome() + " percorreu a distância " + carros.get(carroCorredor));
        }
    }

    private boolean corridaTerminou() {
        for (Integer distanciaPercorrida : carros.values()) {
            if (distanciaPercorrida >= distanciaDaPista) {
                return true;
            }
        }
        return false;
    }

}
