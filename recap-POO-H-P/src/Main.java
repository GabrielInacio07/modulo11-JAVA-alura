import Model.Ex02.Aluno;
import Model.Ex02.Docente;
import Model.Ex03.Ebook;
import Model.Ex03.Livro;
import Model.Ex03.Midia;
import Model.Ex03.Revista;

class Main{
    public static void main(String[] args) {
        System.out.println("EX03");

        Livro book = new Livro("O príncepe",2005,"Máquiavel");
        Revista revista = new Revista("Shonen Jump",2026,14);
        Ebook ebook = new Ebook("Clean Code",2008,"PDF");

        book.showDetails();
        revista.showDetails();
        ebook.showDetails();
//        Midia teste = new Midia("Hobbit","1993");
//
//        System.out.println(teste.gerarCodigo(teste.getTitle(),teste.getYear()));
    }
}