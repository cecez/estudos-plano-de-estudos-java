const Tarefa = require("./Tarefa.js");

class ListaDeTarefas {
	constructor(db) {
		this.db = db;
	}

	async adicionar(titulo) {
		await this.db.runAssincrono(
			"insert into tarefas(titulo, concluida) values(?, ?);", 
			[titulo, 0]
		);
	}

	async consultar() {
		const resultado = await this.db.runAllAssincrono(
			"SELECT * FROM tarefas;",
			[]
		);

		return resultado;
	}
}

module.exports = ListaDeTarefas;