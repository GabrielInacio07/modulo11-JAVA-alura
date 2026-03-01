package Model.Ex05;

public abstract class Payment {

    private double valor;

    public Payment(double valor) {
        this.valor = valor;
    }

    public double getValor(){return valor;}

    public abstract double efetuarPagamento();

    public abstract void exibirPagamento();
}
