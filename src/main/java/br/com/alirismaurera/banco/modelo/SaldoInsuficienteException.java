package br.com.alirismaurera.banco.modelo;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
