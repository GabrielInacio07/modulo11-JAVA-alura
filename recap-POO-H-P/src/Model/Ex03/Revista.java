package Model.Ex03;

public class Revista extends Midia{

    private int edicao;

    public Revista(String title, int year, int edicao) {
        super(title, year);
        this.edicao = edicao;
    }

    @Override
    public void showDetails() {
        System.out.println("Código: " + gerarCodigo() + " | Revista: "  + getTitle() + " - Edição: " + edicao);
    }
}
