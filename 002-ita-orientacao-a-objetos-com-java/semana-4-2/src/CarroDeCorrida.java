public abstract class CarroDeCorrida {

    protected int velocidadeMaxima;
    protected int velocidade;
    protected String nome;

    public CarroDeCorrida(String nome, int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = 0;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void acelerar();

    public void frear()
    {
        velocidade = velocidade / 2;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
