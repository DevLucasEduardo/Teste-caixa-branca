# Teste-caixa-branca

## Descrição

A seguir serão descritos os erros encontrados na classe User, a qual tem como responsabilidade
autenticar usuários em um banco de dados MySQL. 

## Documentação no Código

A partir do código não é possível saber se há documentação sobre este. 
Ainda assim, deveriam haver mais comentários ao longo deste indicando
o que está sendo feito. No que foi apresentado 
não há informação suficiente para dar suporte aos envolvidos.

## Nomenclatura de Variáveis e Constantes

A nomenclatura de algumas variáveis no código não proporcionam informações de forma clara.
É importante que os nomes das variáveis e constantes de um código sejam capazes de 
trazer clareza a quem interage com ele.

## Legibilidade e Organização do Código

O código não foi bem organizado, o que dificulta o entendimento. Chaves são fechadas
na mesma linha de trechos de códigos e não há espaçamento para trechos com diferentes
responsabilidades.

## Arquitetura Utilizada

Não é possível identificar qualquer tipo de arquitetura no código. As lógicas de negócio 
poderiam ser separadas para que não haja diferentes responsabilidades para uma classe apenas.
A conexão com o banco poderia ser criada em uma classe específica para tal.

## Fechamento de Conexões

Não há fechamento da conexão com o banco de dados. Por consequência disso, 
podem ocorrer vazamentos e problemas de performance. 




