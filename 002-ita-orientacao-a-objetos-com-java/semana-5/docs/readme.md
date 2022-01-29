# Importância do encapsulamento

Como você trabalha com sistema que tem algumas milhões de linhas de código? 

Você acha que o desenvolvedor desse sistema vai conhecer uma por uma, todas essas linhas de código? 

Não. 

Então o que acontece, ele precisa conhecer a parte muito bem a parte que ele está trabalhando, e ele precisa conhecer essa **superfície** que a gente falou dos módulos que interagem com aquele que ele está trabalhando.

# Métodos de acesso

- Padrão Java Beans (getAtributo(), setAtributo())
- nos métodos set(), pode-se incluir alguma validação antes de alterar o valor
- nos métodos get(), pode-se incluir alguma formatação antes de retornar o valor


# Encapsulamento de objetos e arrays

- Se houver um método get(), o retorno será um ponteiro para o atributo, ou seja, abre brecha para modificações diretas no dado.
  - Solução 1: retornar um clone/cópia
  - Solução 2: esconder o objeto