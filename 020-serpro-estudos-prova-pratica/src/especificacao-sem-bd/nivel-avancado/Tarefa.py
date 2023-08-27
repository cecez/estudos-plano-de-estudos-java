class Tarefa:
	def __init__(self, titulo):
		self.titulo = titulo
		self.concluida = False

	def descricao(self):
		retorno = "["
		if self.concluida:
			retorno += 'x'
		else:
			retorno += ' '
		retorno += "]"
		retorno += f' {self.titulo}'
		return retorno

	def concluir(self):
		self.concluida = True