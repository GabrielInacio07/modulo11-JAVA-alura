import Model.Ex05.Boleto;
import Model.Ex05.CartaoCredito;
import Model.Ex05.PIX;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex05");

        CartaoCredito credito = new CartaoCredito(9123);
        Boleto boleto = new Boleto(10500);
        PIX pix = new PIX(1500);

        credito.exibirPagamento();
        System.out.println("----------");

        boleto.exibirPagamento();
        System.out.println("----------");

        pix.exibirPagamento();
        System.out.println("----------");

    }
}