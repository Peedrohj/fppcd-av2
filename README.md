# Fppcd-av2
Repositório para o projeto de avaliação da 2 unidade da disciplina de Fundamentos de Programação Paralela, Concorrente e Distribuída do Cesar School

A aplicação é composta por 3 componentes:
* Carrinho de compras
* Estoque 
* Expedição
* Cobrança 

Sendo o client da aplicação o "Carrinho de compras" e os servers os outros componentes, para isso toda comunicação é realizada ultilizando REST, fazendo requisisções HTTP para cada componente do server. 

Para rodar o código, é necessário primeiramente rodar todos os componentes do server side, e por útlimo rodar o client.

Por padrão os componentes do server estão configurados da seguinte forma: 

> <ul>
>   <li>O estoque está na porta: <strong>8081</strong></li>
>   <li>A expedição está na porta: <strong>8082</strong></li>
>   <li>A cobrança está na porta: <strong>8083</strong></li>
> </ul>


Caso isso seja modificado, é necessário trocar no client, no parametro urls que está dentro de Application
