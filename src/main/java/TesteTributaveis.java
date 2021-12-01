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
