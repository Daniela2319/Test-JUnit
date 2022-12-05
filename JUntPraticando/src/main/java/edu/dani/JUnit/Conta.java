package edu.dani.JUnit;

public class Conta {


    private String numeroConta;
    private double Saldo;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        Saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return Saldo;
    }
}
