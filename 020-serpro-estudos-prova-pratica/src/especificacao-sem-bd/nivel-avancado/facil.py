"""
Exercício: Crie um programa que solicite ao usuário que insira seu nome e idade. Em seguida, exiba uma mensagem que diga "Olá, [nome]! Você tem [idade] anos."
"""

import sys

def imprimirNomeIdade(nome, idade):
	print(f'Olá, {nome}! Você tem {idade} anos.')

def solicitarDadosAoUsuario():
	print("solicitar dados ao usuário")
	idade = int(input("Qual sua idade? "))
	nome = input("Qual seu nome? ")
	imprimirNomeIdade(nome, idade)


def usuarioJaPassouOsDados():
	print("usuário já passou os dados")
	idade = sys.argv[1]
	nome = sys.argv[2]
	imprimirNomeIdade(nome, idade)

quantidadeDeArgumentos = len(sys.argv)

if quantidadeDeArgumentos >= 3:
	usuarioJaPassouOsDados()
else:
	solicitarDadosAoUsuario()
