# Fppcd-av2
Repositório para o projeto de avaliação da 2 unidade da disciplina de Fundamentos de Programação Paralela, Concorrente e Distribuída do Cesar School

A aplicação é composta por 3 componentes:
* Carrinho de compras
* Estoque 
* Expedição
* Cobrança 

Sendo o client da aplicação o "Carrinho de compras" e os servers os outros componentes, para isso toda comunicação é realizada ultilizando REST, fazendo requisisções HTTP para cada componente do server. 

Para rodar o código, é necessário primeiramente rodar todos os componentes do server side, e por utlimo rodar client.

Por padrão o server side está configurado da seguinte forma: 
```md
* O estoque está na porta: **__8081__**
* A expedição está na porta: **__8082__**
* A cobrança está na porta: **__8083__**
```

Caso isso seja modificado, é necessário trocar no client, no parametro urls que está dentro de Application