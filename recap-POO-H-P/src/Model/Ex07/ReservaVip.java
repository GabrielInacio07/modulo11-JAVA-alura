package Model.Ex07;

public class ReservaVip extends Reserva{

    @Override
    public void realizarReserva() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
