public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
       double valorAsacar = valor + 0.2;
       super.saca(valorAsacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo()*0.01;
    }

}
