public class Tarefa {
	private String titulo;
	private boolean concluida;

	public Tarefa(String titulo) {
		this.titulo = titulo;
		this.concluida = false;
	}

	public String titulo() {
		return this.titulo;
	}

	public boolean concluida() {
		return this.concluida;
	}

	public void concluir() {
		this.concluida = true;
	}

	@Override
	public String toString() {
		return "[titulo=" + titulo + ", concluida=" + concluida + "]";
	}
}