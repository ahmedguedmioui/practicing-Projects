package Airport;

import static print.print.*;
public class Flight {
    String toCity;
    long ID;
    Ticket ticket;

    Flight(Ticket ticket) {
        this.ticket = ticket;
        this.toCity = ticket.where;
        this.ID = ticket.ID;

        Preform_A_Flight();
    }
    void Preform_A_Flight() {
        println("************************************");
        println("  Your flight to "+toCity+" is ready!");
        println("  Flght ID : "+ID);
        println("*************************************");
    }
}