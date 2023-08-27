const sqlite3 = require("sqlite3").verbose();

class BancoDeDados {
	constructor() {
		this.db = new sqlite3.Database("avancado.db");
	}

	runAssincrono(comando, parametros) {
		return new Promise((resolve, reject) => {
			this.db.run(comando, parametros, (erro) => {
				if (erro) {
					reject(erro);
					return;
				}

				resolve("ok");
			});
		});
	}

	runAllAssincrono(comando, parametros) {
		return new Promise((resolve, reject) => {
			this.db.all(comando, parametros, (erro, retorno) => {
				if (erro) {
					reject(erro);
					return;
				}

				resolve(retorno);
			});
		});
	}

	async criarTabela() {
		await this.runAssincrono("drop table if exists tarefas;");
		await this.runAssincrono("create table if not exists tarefas(id integer primary key autoincrement, titulo text, concluida integer)");
	}

	fechar() {
		this.db.close();
	}
}

module.exports = BancoDeDados;