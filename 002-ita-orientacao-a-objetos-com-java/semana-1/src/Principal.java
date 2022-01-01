
public class Principal {

    public static void main(String[] args)
    {
        Carro uno = new Carro();
        uno.nome = "Uno milho";
        uno.velocidade = 0;
        uno.potencia = 10;

        uno.imprimir();

        uno.acelerar();

        uno.imprimir();

        uno.frear();

        uno.imprimir();
    }
}
