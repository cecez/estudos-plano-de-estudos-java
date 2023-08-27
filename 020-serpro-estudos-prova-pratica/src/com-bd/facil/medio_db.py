"""
Nível Médio:

Exercício: Crie um programa que leia dados de um arquivo CSV contendo informações de alunos (por exemplo, nome, idade, curso) e insira esses dados em uma tabela de banco de dados MySQL.
"""

import sqlite3
import csv

def main():
	print("Iniciando main")
	
	# cria tabela
	conexao = sqlite3.connect("medio.db")
	cursor = conexao.cursor()

	cursor.execute("drop table if exists alunos")
	cursor.execute("create table alunos(id integer primary key autoincrement, nome text, idade integer, curso text)")

	with open("alunos.csv") as arquivo:
		leitor = csv.reader(arquivo)

		for linha in leitor:
			tupla = tuple(linha)
			cursor.execute("insert into alunos(nome, idade, curso) values(?, ?, ?)", tupla)

	consulta = cursor.execute("SELECT * FROM alunos")
	registros = consulta.fetchall()
	for registro in registros:
		print(registro)

	cursor.close()
	conexao.close()
	
	print("Terminando main")

if __name__ == "__main__":
	main()