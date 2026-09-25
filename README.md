# Design Patterns em Java

Projeto desenvolvido como parte de um desafio prático sobre **Design Patterns**, com o objetivo de aplicar o padrão **Chain of Responsibility** utilizando Java puro.

## Sobre o projeto

O projeto simula a validação de um pedido de compra.

Antes que um pedido seja aprovado, ele passa por uma sequência de validações:

```text
Pedido
  ↓
Validação do valor
  ↓
Validação do estoque
  ↓
Validação do pagamento
  ↓
Pedido aprovado
```

Cada validação é responsável por uma etapa específica e, caso a validação seja concluída com sucesso, o pedido é encaminhado para o próximo handler.

## Design Pattern utilizado

### Chain of Responsibility

O **Chain of Responsibility** permite que uma solicitação percorra uma sequência de objetos responsáveis por processá-la.

Neste projeto, cada validação representa um `Handler`:

* `ValueValidator` — verifica se o valor do pedido é válido;
* `StockValidator` — verifica se o produto possui estoque;
* `PaymentValidator` — verifica se o pagamento foi aprovado.

A cadeia é construída da seguinte forma:

```text
ValueValidator
      ↓
StockValidator
      ↓
PaymentValidator
```

Caso alguma validação falhe, a execução da cadeia é interrompida.

## Exemplo

Para um pedido válido:

```text
Valor válido.
Estoque disponível.
Pagamento aprovado.
Pedido aprovado!
```

Caso o produto não tenha estoque:

```text
Valor válido.
Pedido inválido: produto sem estoque.
```

Nesse caso, o `PaymentValidator` não é executado.

## Tecnologias

* Java 21
* Maven

## Como executar

Clone o projeto:

```bash
git clone https://github.com/paulo-tavaresx/design-patterns-dio-challenge.git
```

Entre no diretório:

```bash
cd design-patterns
```

Execute o projeto pelo IntelliJ IDEA ou através do Maven:

```bash
mvn compile
```

O projeto possui uma classe `Main` responsável por demonstrar o funcionamento do padrão.

## Estrutura do projeto

```text
src/
└── main/
        └── br/
            └── com/
                └── paulotavares/
                    └── designpatterns/
                        ├── Main.java
                        └── chain/
                            ├── Handler.java
                            ├── Order.java
                            ├── ValueValidator.java
                            ├── StockValidator.java
                            └── PaymentValidator.java
```

## Objetivo

Este projeto foi desenvolvido para consolidar os conhecimentos sobre **Design Patterns** e demonstrar, de forma prática, a utilização do padrão **Chain of Responsibility** em Java.
