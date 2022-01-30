public class ComTítulo implements FormatadorNome {

    private final String titulo;

    public ComTítulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}
