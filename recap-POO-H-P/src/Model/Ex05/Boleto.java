package Model.Ex05;

public class Boleto extends Payment implements Taxa{

    private static final double Taxa_Boleto = 1;

    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return getValor() * (Taxa_Boleto / 100);
    }

    @Override
    public double efetuarPagamento() {

        return (getValor() + calcularTaxa());
    }

    @Override
    public void exibirPagamento() {
        double taxa = calcularTaxa();
        double total = efetuarPagamento();

        System.out.println("=== PAGAMENTO VIA BOLETO ===");
        System.out.println("Valor original: R$ " + getValor());
        System.out.println("Taxa (1%): R$ " + taxa);
        System.out.println("Valor final: R$ " + total);
        System.out.println("Pagamento confirmado com sucesso!");
    }


}
