package br.com.alirismaurera.banco.modelo;

import br.com.alirismaurera.banco.testes.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
