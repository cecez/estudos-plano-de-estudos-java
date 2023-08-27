from Contato import Contato
from Agenda import Agenda
import unittest

class AgendaTest(unittest.TestCase):

	def setUp(self):
		self.agenda = Agenda()

	def test_adicionar(self):
		# arrange
		nome, telefone, email = ("nome", "1111", "email@email.com")
		contatos_antes = len(self.agenda.contatos)
		
		# act
		self.agenda.adicionar(nome, telefone, email)
		
		# assert
		self.assertEqual(contatos_antes, 0)
		self.assertEqual(len(self.agenda.contatos), 1)

if __name__ == "__main__":
	unittest.main()