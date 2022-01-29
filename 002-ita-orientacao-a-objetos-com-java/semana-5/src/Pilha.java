public class Pilha {

    private Object[] elementos;
    private int indiceTopo = 0;

    Pilha(int maximoDeElementos) {
        elementos = new Object[maximoDeElementos];
    }

    public void empilhar(Object elemento) {
        elementos[indiceTopo] = elemento;
        indiceTopo++;
    }

    public Object desempilhar() {
        return elementos[--indiceTopo];
    }

    public Object topo() {
        return elementos[indiceTopo-1];
    }

    public int tamanho() {
        return indiceTopo;
    }

}
