package edu.dani.JUnit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //fez algo
        LOGGER.info("Iniciou conexao");
    }
    public static void finalizarConexao(){
        //fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no banco de dados
        LOGGER.info("Inseriu Dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove pessoa do banco de dados
        LOGGER.info("Remove Dados");
    }
}
