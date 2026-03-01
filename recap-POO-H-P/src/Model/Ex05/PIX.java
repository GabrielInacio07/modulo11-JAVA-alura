package Model.Ex05;

public class PIX extends Payment implements Taxa{

    private static final double Taxa_PIX = 0;

    public PIX(double valor) {
        super(valor);
    }

    @Override
    public double calcularTaxa() {
        return getValor() * (Taxa_PIX / 100);
    }

    @Override
    public double efetuarPagamento() {
        return (getValor() + calcularTaxa());
    }

    @Override
    public void exibirPagamento() {
        double taxa = calcularTaxa();
        double total = efetuarPagamento();

        System.out.println("=== PAGAMENTO VIA PIX ===");
        System.out.println("Valor original: R$ " + getValor());
        System.out.println("Taxa (0%): R$ " + taxa);
        System.out.println("Valor final: R$ " + total);
        System.out.println("Pagamento confirmado com sucesso!");
    }


}
