"""
Nível Fácil:

Exercício: Crie um programa que se conecte a um banco de dados SQLite, crie uma tabela chamada "alunos" com campos para nome, idade e curso, insira alguns registros nessa tabela e, em seguida, recupere e exiba esses registros.
"""

import sqlite3

def cria_conexao():
	conexao = sqlite3.connect("facil_db.db")
	cursor = conexao.cursor()
	return {"conexao": conexao, "cursor": cursor}

def cria_tabela(bd):
	bd["conexao"].execute("drop table if exists alunos")
	bd["conexao"].execute("create table alunos(id integer primary key autoincrement, nome text, idade integer, curso text)")

def fecha_conexao(bd):
	bd["cursor"].close()
	bd["conexao"].close()

def insere_registros(bd):
	alunos = [
		{"nome": "Aluno 1", "idade": 111, "curso": "Curso CCCC"},
		{"nome": "Aluno 2", "idade": 1, "curso": "Curso A"},
		{"nome": "Aluno 3", "idade": 11, "curso": "Curso CCCC"},
		{"nome": "Aluno 4", "idade": 121, "curso": "Curso CCCC"},
		{"nome": "Aluno 5", "idade": 21, "curso": "Curso CCCC"},
	]

	for aluno in alunos:
		bd["cursor"].execute(
			"INSERT INTO alunos(nome, idade, curso) VALUES(?, ?, ?)", 
			(aluno["nome"], aluno["idade"], aluno["curso"])
		)

def consulta_registros(bd):
	bd["cursor"].execute("SELECT * FROM alunos")
	retorno = bd["cursor"].fetchall()
	for aluno in retorno:
		print(aluno)

def main():
	bd = cria_conexao()
	cria_tabela(bd)
	insere_registros(bd)
	consulta_registros(bd)
	fecha_conexao(bd)

if __name__ == "__main__":
	main()