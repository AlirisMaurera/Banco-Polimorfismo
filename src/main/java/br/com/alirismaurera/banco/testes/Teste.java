package br.com.alirismaurera.banco.testes;


import br.com.alirismaurera.banco.modelo.Cliente;
import br.com.alirismaurera.banco.modelo.Conta;
import br.com.alirismaurera.banco.modelo.ContaCorrente;
import br.com.alirismaurera.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Teste {

    public static void main(String[] args) {

        ArrayList<Conta> ref = new ArrayList<Conta>();
        ContaCorrente cc = new ContaCorrente(222, 511);
        cc.deposita(200);
        Cliente c1 = new Cliente();
        c1.setNome("Aliris");
        cc.setTitular(c1);

        ContaPoupanca cc1 = new ContaPoupanca(223, 141);
        Cliente c2 = new Cliente();
        c2.setNome("Sebastian");
        cc1.setTitular(c2);

        ContaCorrente cc2 = new ContaCorrente(224, 131);
        Cliente c3 = new Cliente();
        c3.setNome("Franlis");
        cc2.setTitular(c3);

        ContaPoupanca cc3 = new ContaPoupanca(422, 11);
        Cliente c4 = new Cliente();
        c4.setNome("Franklin");
        cc3.setTitular(c4);

        ref.add(cc);
        ref.add(cc1);
        ref.add(cc2);
        ref.add(cc3);

//      Comparastring cs = new Comparastring();
//      ref.sort(cs);
        Collections.sort(ref);

        ref.forEach(conta -> System.out.println(conta.getAgencia()));




    }
}
class Comparastring implements Comparator<Conta>{


    @Override
    public int compare(Conta o1, Conta o2) {
        String nome1 = o1.getTitular().getNome();
        String nome2 = o2.getTitular().getNome();

        return nome1.compareTo(nome2);

     }
}
class Comparacao implements Comparator<Conta>{

    @Override
    public int compare(Conta o1, Conta o2) {

       if (o1.getNumero() < o2.getNumero()){
           return  -1;
       }
        if (o1.getNumero() > o2.getNumero()){
            return  1;
        }
       return 0;
    }
}
