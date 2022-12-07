# Test-JUnit

## Testes Unitários com JUnit

Os testes unitários são essenciais. Sem eles, você está pisando sobre casca de ovos o tempo todo. 

Situações no desenvolvimento de software que mostram a importância de testes unitários:

* Compreender o código fonte
* Corrigir bugs com segurança
* Refatorar código sem introduzir bugs
* Entregar com segurança uma nova feature

## Assertions

Assertions é uma coleção de método utilitário que suportam a declaração de condições em testes.

| Método | Descrição | 
|-|-|
|**assertEquals(a,b)** | Compara dois valores |
| **assertFalse(a)** | Avalia uma expressão booleana|
| **assertTrue(a)**| Avalia uma expressão booleana|
| **assertNotNull(a)**| Compara uma variavel com nulo|
| **assertNull(a)**| Compara uma variavel com nulo|
| **assertNotSame**| Compara dois objetos|
| **fail**| Causa uma falha no teste atual|




## Estrutura Básica

```
class PessoaTeste {

@Test //-> Anotação é primordial para testar

void validarVerificacaoDeMaioridade() {

   Pessoa pessoa = new Pessoa ("João", LocalDate.of(2004,1,1)); // -> cria um cenário
   
    Assertions.assertTrue(pessoa.ehMaiorDeIdade()); // -> Executa as validações
 }
 }
 ```
 
 ## After e Before
 
 ### Before
 Os métodos @Before são executados antes de cada teste, isso é útil quando executa algum código comum antes de executar um teste.
 
 ### After
 Após a notação funciona após os métodos de teste. A operação mais comum na notação After é que valores nulos são enviados para os valores atribuídos
 toda vez após os métodos de teste.
 
  ![image](https://user-images.githubusercontent.com/106537496/206315726-abe7fd0a-e9e3-4aed-9fb8-079b404a2dcd.png)

 
 ## Assumptions
 
 Assumptionse é uma coleção de métodos utilitários que oferecem suporte a execução de teste condicional com base em suposições.
 
 
 
 
 
