package br.com.alirismaurera.banco.testes;

import br.com.alirismaurera.banco.modelo.CalculadorDeImposto;
import br.com.alirismaurera.banco.modelo.ContaCorrente;
import br.com.alirismaurera.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(400);

        SeguroDeVida sg = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.resgistra(cc);
        calc.resgistra(sg);

        System.out.println(calc.getTotalImposto());

    }
}
