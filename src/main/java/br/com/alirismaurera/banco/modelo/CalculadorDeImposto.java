package br.com.alirismaurera.banco.modelo;

import br.com.alirismaurera.banco.testes.Tributavel;

public class CalculadorDeImposto{

    private double totalImposto;

    public void resgistra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto+=valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
