package br.com.alirismaurera.banco.testes;

import br.com.alirismaurera.banco.modelo.Cliente;
import br.com.alirismaurera.banco.modelo.ContaCorrente;
import br.com.alirismaurera.banco.modelo.ContaPoupanca;
import br.com.alirismaurera.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 111);
        Cliente c1 = new Cliente();
        c1.setNome("Aliris Maurera");
        c1.setCpf("45577852");
        c1.setProfissao("software QA");
        cc.setTitular(c1);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        Cliente c2 = new Cliente();
        c2.setNome("Sebastian Maurera");
        c2.setCpf("45577852");
        c2.setProfissao("software QA");
        cp.setTitular(c2);
        cp.deposita(200.0);

        try {

            cc.transfere(50.0, cp);
        }catch (SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente " + e.getMessage());
        }

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

        System.out.println(cc);
        System.out.println(cp);
    }
}
