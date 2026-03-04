import Model.Ex09.Deposito;
import Model.Ex09.OperacaoBancaria;
import Model.Ex09.Saque;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex09");

        OperacaoBancaria deposito = new Deposito(500);
        OperacaoBancaria saque = new Saque(200);

        deposito.executar();
        saque.executar();

    }
}