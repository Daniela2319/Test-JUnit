package edu.dani.JUnit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultaDadosDePessoaTest {

    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
     void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("Frank", LocalDate.of(2020, 2, 23)));
    }
    @AfterEach
     void removerDadosDeRetorno(){
        BancoDeDados.removeDados(new Pessoa("Frank", LocalDate.of(2020, 2, 23)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();

    }
}
