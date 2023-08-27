class Tarefa {
	constructor(titulo) {
		this.titulo = titulo;
		this.concluida = false;
	}

	concluir() {
		this.concluida = true;
	}
}

module.exports = Tarefa