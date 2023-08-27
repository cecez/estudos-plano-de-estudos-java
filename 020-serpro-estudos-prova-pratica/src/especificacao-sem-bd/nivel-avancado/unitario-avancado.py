"""
Nível Avançado:

Exercício: Desenvolva uma classe Agenda que permita adicionar, remover e pesquisar contatos. Cada contato deve ter um nome, número de telefone e endereço de e-mail. Escreva testes unitários para garantir que os métodos da classe Agenda funcionem corretamente.
"""

from Agenda import Agenda

def main():
	print("adicionando contatos")
	agenda = Agenda()

	agenda.adicionar("nome", "1111", "email@email.com")
	agenda.adicionar("nome", "1111", "email@email.com")
	agenda.adicionar("nome", "222", "email@email.com")


	for contato in agenda.contatos:
		print(contato)

if __name__ == "__main__":
	main()