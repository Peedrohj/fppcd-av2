# Fppcd-av2
Repositório para o projeto de avaliação 2 unidade da disciplina de Fundamentos de Programação Paralela, Concorrente e Distribuída do Cesar School

A aplicação é composta por 3 componentes:
* Carrinho de compras
* Estoque 
* Expedição
* Cobrança 

Sendo o client da aplicação o "Carrinho de compras" e os servers os outros componentes, para isso toda comunicação é realizada ultilizando REST, fazendo requisisções HTTP para cada componente do server. 

Para rodar o código, é necessário primeiramente rodar todos os componentes do server side, e por utlimo rodar client.

Por padrão o server side está configurado da seguinte forma: 
```
* O estoque está na porta: 8081
* A expedição está na porta: 8082
* A cobrança está na porta: 8083
```

Caso isso seja modificado, é necessário trocar no client, no parametro urls que está dentro de Application