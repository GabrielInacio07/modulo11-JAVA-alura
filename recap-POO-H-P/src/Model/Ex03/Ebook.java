package Model.Ex03;

public class Ebook extends Midia{

    private String formato;

    public Ebook(String title, int year, String formato) {
        super(title, year);
        this.formato = formato;
    }

    @Override
    public void showDetails() {
        System.out.println("Código: " + gerarCodigo() + " | Ebook: "  + getTitle() + " - Formato: " + formato);

    }
}
