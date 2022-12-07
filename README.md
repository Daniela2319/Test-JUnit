# Test-JUnit

## Testes Unitários com JUnit

Os testes unitários são essenciais. Sem eles, você está pisando sobre casca de ovos o tempo todo. j

Situações no desenvolvimento de software que mostram a importância de testes unitários:

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
 
 ## After e Before
 
 ###Before
 Os métodos @Before são executados antes de cada teste, isso é útil quando executa algum código comum antes de executar um teste.
 
 ###After
 Após a notação funciona após os métodos de teste. A operação mais comum na notação After é que valores nulos são enviados para os valores atribuídos
 toda vez após os métodos de teste.
 
 
