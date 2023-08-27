"""
Nível Avançado:

Exercício: Desenvolva um programa que permita ao usuário criar uma lista de tarefas. O programa deve permitir que o usuário adicione tarefas, marque tarefas como concluídas e exiba a lista de tarefas pendentes e concluídas.
"""

from Tarefa import Tarefa

t1 = Tarefa("task one")
t2 = Tarefa("ttwo")

lista_de_tarefas = []
lista_de_tarefas.append(t1)
lista_de_tarefas.append(t2)

print("Total de " + str(len(lista_de_tarefas)) + " tarefas.")

tRecuperado = lista_de_tarefas[1]
tRecuperado.concluir()


for chave, tarefa in enumerate(lista_de_tarefas):
	print(str(chave) + "." + tarefa.descricao())