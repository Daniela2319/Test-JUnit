# Test-JUnit

## Testes Unitários com JUnit

Situações no desenvolvimento de software que mostram a importância de testes unitários

* Compreender o código fonte
* Corrigir bugs com segurança
* Refatorar código sem introduzir bugs
* Entregar com segurança uma nova feature

## Assertions

Assertions é uma coleção de método utilitário que suportam a declaração de condições em testes.

## Estrutura Básica

class **PessoaTeste** {

**@Test** //-> Anotação é primordial para testar

**void** validarVerificacaoDeMaioridade() {

   **Pessoa** pessoa = new **Pessoa** ("João", LocalDate.of(2004,1,1)); // -> cria um cenário
   
    Assertions.assertTrue(pessoa.ehMaiorDeIdade()); // -> Executa as validações
 }
 }
 
 
 
