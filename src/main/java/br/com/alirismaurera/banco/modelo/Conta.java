package br.com.alirismaurera.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 *
 * @author Aliris Maurera
 */

public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        if (agencia <1){throw new IllegalArgumentException("Agencia inválida");}
        if (numero < 1){throw new IllegalArgumentException("Número invalido");}

        Conta.total++;
      //  System.out.println("O total de contas é " + br.com.alirismaurera.banco.modelo.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
      //  System.out.println("Estou criando uma conta " + this.numero);
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    /**
     * Metodo que representa o saque de valor de uma conta verifica se pode realizar transação
     *
     * @author Aliris Maurera
     * @throws SaldoInsuficienteException
     */

    public void saca(double valor) throws SaldoInsuficienteException {
       if (this.saldo < valor) {
           throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
       }
        this.saldo = this.saldo - valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);

    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("Não pode ser numero negativo ou 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >= 0){
            System.out.println("Não pode ser esse valor");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    public String toString() {
        return " Agencia: " + this.getAgencia() + " Número: " + this.getNumero() +
                "\n" + this.getTitular();
    }
}
