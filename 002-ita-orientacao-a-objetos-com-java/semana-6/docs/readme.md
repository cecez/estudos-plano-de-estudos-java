# Law of Demeter (LoD)
**Don't talk to strangers**

Um método m() de um objeto deve invocar apenas os métodos dos seguintes tipos de objetos:
1. o próprio objeto (this)
2. os parâmetros de m()
3. quaisquer objetos que m() instancia
4. objetos componentes diretos do objeto (variáveis de instância de relacionamentos)

## Solução
1. Tell, don't ask
2. Redirecionamento (métodos com mesmo nome) ou (delegação, passa necessidade adiante)