public class CarroSoma extends CarroDeCorrida {

    protected int potencia;

    public CarroSoma(int potencia, int velocidadeMaxima, String nome) {
        super(nome, velocidadeMaxima);
        this.potencia = potencia;
    }

    @Override
    public void acelerar()
    {
        velocidade += potencia;

        if (getVelocidade() > getVelocidadeMaxima()) {
            velocidade = getVelocidadeMaxima();
        }
    }

}
