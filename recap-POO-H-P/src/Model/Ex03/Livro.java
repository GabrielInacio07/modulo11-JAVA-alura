package Model.Ex03;

public class Livro extends Midia{

    private String autor;

    public Livro(String title, int year, String autor) {
        super(title, year);
        this.autor = autor;
    }

    @Override
    public void showDetails() {
        System.out.println("Código: " + gerarCodigo() + " | Livro: "  + getTitle() + " - Autor: " + autor);
    }
}
