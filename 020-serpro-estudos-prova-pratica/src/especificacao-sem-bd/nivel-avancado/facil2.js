/*

Exercício: Crie um programa que solicite ao usuário que insira seu nome e idade. Em seguida, exiba uma mensagem que diga "Olá, [nome]! Você tem [idade] anos."

*/

const readline = require("readline");

const leitor = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

let nome, idade;

leitor.question("Nome: ", function(respostaNome) {
	nome = respostaNome;
	leitor.question("Idade: ", function(respostaIdade) {
		idade = respostaIdade;
		leitor.close();
		imprimeSaida();
	})
});

function imprimeSaida() {
	console.log(`Olá, ${nome}! Você tem ${idade} anos.`);
}