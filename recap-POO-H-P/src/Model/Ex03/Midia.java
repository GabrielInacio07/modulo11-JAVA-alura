package Model.Ex03;

public abstract class Midia {

    private String title;
    private int year;

    public Midia(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    protected String gerarCodigo(){

        String codigo = title.length() >=3 ? title.substring(0,3)
                .replaceAll("\\s+", "")
                : title;

        return "LIB-" + codigo + year ;
    }

    public abstract void showDetails ();

}
