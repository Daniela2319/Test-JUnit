package edu.dani.JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

    /*@Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuarioDani(){
        Assertions.assertEquals(10, 5+5);
    }*/

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "edu.dani.JUnit")
    void validarAlgoSomenteNoUsuarioACER(){
        Assertions.assertEquals(10, 5+5);
    }
}
