/*

Exercício: Crie um programa que solicite ao usuário que insira seu nome e idade. Em seguida, exiba uma mensagem que diga "Olá, [nome]! Você tem [idade] anos."

*/

const readline = require("readline");

nome = "";
idade = 0;

const leitor = readline.createInterface({
	input: process.stdin,
	output: process.stdout
});

leitor.question("Digite seu nome: ", function(resposta) {
	nome = resposta;

	leitor.question("Digite sua idade: ", function(resposta2) {
		idade = resposta2;
		leitor.close();

		console.log(`Olá, ${nome}! Você tem ${idade} anos.`);
	});
});


