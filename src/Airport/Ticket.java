package Airport;

import java.util.Random;
import static print.print.*;
public class Ticket {
    Random rand = new Random();
    ShooseCity SC = new ShooseCity();

    String where;
    long ID;

    Ticket(String where) {
        this.where = where;
        ID = rand.nextInt(999999999);
        YourTicket();
    }
    void YourTicket() {
        println("+++++++++++++++++++++++");
        println("   TICKET TO "+where);
        println("   ID: "+ID);
        println("+++++++++++++++++++++++");
    }
}