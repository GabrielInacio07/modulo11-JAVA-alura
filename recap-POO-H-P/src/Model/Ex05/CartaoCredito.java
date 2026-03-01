package Model.Ex05;

public class CartaoCredito extends Payment implements Taxa{

    private static final double Taxa_Cartao_Credito = 3;

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double efetuarPagamento() {

        return getValor() + calcularTaxa();
    }

    @Override
    public double calcularTaxa() {
        return getValor() * (Taxa_Cartao_Credito / 100 );
    }

    public void exibirPagamento() {
        double taxa = calcularTaxa();
        double total = efetuarPagamento();

        System.out.println("=== PAGAMENTO VIA CARTÃO DE CRÉDITO ===");
        System.out.println("Valor original: R$ " + getValor());
        System.out.println("Taxa (3%): R$ " + taxa);
        System.out.println("Valor final: R$ " + total);
        System.out.println("Pagamento confirmado com sucesso!");
    }
}
