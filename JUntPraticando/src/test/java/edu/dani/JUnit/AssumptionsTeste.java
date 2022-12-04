package edu.dani.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioDani(){
        Assumptions.assumeFalse("Acer".equals(System.getenv("USER"))); //só vou executar se for usuário
        Assertions.assertEquals(10, 5+5);
    }
}
