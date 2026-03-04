package Model.Ex07;

import java.time.LocalDate;

public class Reserva {


    public void realizarReserva(){
        System.out.println("Reserva Realizada");
    }

    public void realizarReserva(LocalDate data){
        System.out.println("Reserva feita para a data: " + data);
    }

    public void realizarReserva(LocalDate data, int quantidadePessoas){
        System.out.println("Reserva feita para a data: " + data + " para " + quantidadePessoas + " pessoas");
    }
}
