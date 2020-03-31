Exemplo 1)

Order linha 25: acede diretamente aos atributos

OrderLine: os atributos deveriam ser privados (resolvido com Encapsulate Field)

Order linha 27: if pode ser simplificado (Code Bloater, resolvido com Inline Method)

OrderLine é uma Lazy Class

Order.printOrder(): order tem feature envy de orderLine (resolvido com Move Method)

Exemplo 2)

Divergent change: Fazer extract subclass, para poder eliminar o type por completo

Switch statement: Resolvido ao eliminar o type (Replace conditional with polymorphism)

Feature envy no cálculo da área, Move Method

Exemplo 3)

Divergent change: Fazer extract subclass (Fixed, Percentage e No (introduce null object))

Usamos inline temp nas linhas 18 e 22

Exemplo 4)

Refused Bequest, Client não usa todas as funcionalidades de worker