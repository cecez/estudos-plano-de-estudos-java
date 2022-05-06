import java.util.Arrays;

public class Pilha {

    private final Object[] elementos;
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

    public Object[] getElementos() {
        // realiza cópia do array para que não passe referência
        // do contrário, encapsulamento estaria violado (permitiria alterar o array)
        return Arrays.copyOf(elementos, tamanho());
    }
}
