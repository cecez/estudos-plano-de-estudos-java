/*
Exercício: Crie um programa que leia uma lista de números digitados pelo usuário e, em seguida, calcule e exiba a média desses números.
*/

const readline = require("readline");

if (process.argv.length > 2) {
	entradaPelosArgumentos();
} else {
	entradaPeloUsuario();
}

function entradaPelosArgumentos() {
	console.log("-- lendo entrada pela linha de comando");
	let soma = 0;
	let totalDeNumeros = 0;

	for (i=2; i<process.argv.length; i++) {
		totalDeNumeros++;
		soma += parseInt(process.argv[i]);
	}

	console.log(`${soma} / ${totalDeNumeros}`);
	console.log(soma / totalDeNumeros);
}

function entradaPeloUsuario() {
	console.log("-- lendo entrada do usuário");
	const leitor = readline.createInterface({
		input: process.stdin,
		output: process.stdout
	});

	leitor.question("Digite vários números: ", function(retorno) {
		const numeros = retorno.split(' ');
		const totalDeNumeros = numeros.length;
		let soma = 0;

		for (i=0; i<totalDeNumeros; i++) {
			soma += parseInt(numeros[i]);
		}

		console.log(`${soma} / ${totalDeNumeros}`);
		console.log(soma / totalDeNumeros);

		leitor.close();
	});
}