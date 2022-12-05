package edu.dani.JUnit;

public class TransferenciaEntreContas {

    public void tranfere(Conta contaOrigem, Conta contaDestino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
}
