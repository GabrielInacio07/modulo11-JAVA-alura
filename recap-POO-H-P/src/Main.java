import Model.Ex10.ArCondicionado;
import Model.Ex10.Luz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex10");


        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();
        luz.desligar();

        System.out.println();

        ar.ligar();
        ar.ligar();
        ar.desligar();
        ar.desligar();
    }
}