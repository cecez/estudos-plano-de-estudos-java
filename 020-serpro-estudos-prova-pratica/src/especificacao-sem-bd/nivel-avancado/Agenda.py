from Contato import Contato

class Agenda:
	def __init__(self):
		self.contatos = []

	def _existe_contato(self, contato):
		for contato_existente in self.contatos:
			if contato_existente == contato:
				return True

		return False

	def adicionar(self, nome, telefone, email):
		contato = Contato(nome, telefone, email)
		if (self._existe_contato(contato)):
			return False

		self.contatos.append(contato)
		return True

	def remover(self, contato):
		return None

	def pesquisar(self, dado):
		return None

