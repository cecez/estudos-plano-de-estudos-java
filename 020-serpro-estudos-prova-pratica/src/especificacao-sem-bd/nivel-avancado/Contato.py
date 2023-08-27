class Contato:
	def __init__(self, nome, telefone, email):
		self.nome = nome
		self.telefone = telefone
		self.email = email

	def __str__(self):
		return f"[nome={self.nome}, telefone={self.telefone}, email={self.email}]"

	def __eq__(self, outro):
		if not isinstance(outro, Contato):
			return False

		return self.nome == outro.nome and self.telefone == outro.telefone and self.email == outro.email
