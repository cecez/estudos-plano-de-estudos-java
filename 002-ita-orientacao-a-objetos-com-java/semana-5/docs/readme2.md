# Caracterizando acoplamento

- Acoplamento: descreve os relacionamentos e dependências entre classes


- Acoplamento alto: muitas dependências e ligações, prejudica desenvolvimento, modificação e reuso
  - Pior tipo: internal data coupling = acoplamento com dados internos da classe (dados públicos)
  - Getter e setters a vontade, viola o encapsulamento



- Acoplamento baixo: mínimo de ligações, ideal


# Aplicando Princípio "Tell, Don't Ask!" para Obter Acoplamento Baixo

- Não peça ao objeto pela informação que necessita para fazer o trabalho 
- Peça ao objeto para fazer o trabalho para você
- Diminui o acoplamento entre classes
- Diminui necessidade de getters e setters

Convenção: getters e setters protegidos/protected (#)