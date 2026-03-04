 import Model.Ex07.Reserva;
 import Model.Ex07.ReservaVip;

 import java.sql.SQLOutput;
 import java.time.LocalDate;


 public class Main {
    public static void main(String[] args) {
        System.out.println("Ex07");

        LocalDate data = LocalDate.of(2026,5,22);

        Reserva reserva = new Reserva();
        ReservaVip vip = new ReservaVip();

        System.out.println("=========RESERVA=========");
        reserva.realizarReserva();
        reserva.realizarReserva(data);
        reserva.realizarReserva(data,5);

        System.out.println("\n=========RESERVA VIP=========");
        vip.realizarReserva();


    }
}