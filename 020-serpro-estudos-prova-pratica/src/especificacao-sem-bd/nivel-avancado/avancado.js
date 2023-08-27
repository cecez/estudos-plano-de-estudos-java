/*
Exercício: Desenvolva um programa que simule um sistema de gerenciamento de tarefas (to-do list). O programa deve permitir que o usuário adicione, marque como concluída e liste as tarefas. Utilize um banco de dados (por exemplo, SQLite ou MongoDB) para armazenar informações sobre as tarefas.
*/


const ListaDeTarefas = require("./ListaDeTarefas.js");
const BancoDeDados = require("./BancoDeDados.js")


async function main() {
	console.log("iniciando");
	const db = new BancoDeDados();
	await db.criarTabela();

	lista = new ListaDeTarefas(db);
	await lista.adicionar("t1");
	await lista.adicionar("t2");
	await lista.adicionar("t3");

	const retorno = await lista.consultar();
	console.log(retorno);

	db.fechar();
}

main();