package Factory;

import java.util.*;
import static print.print.*;

public class Factory {
    String name;
    Date date;
    int ID;

    Factory(String name, Date date, int ID) {
        this.name = name;
        this.date = date;
        this.ID = ID;
    }
    public String toString() {
        return "******************************\n           "+
                name+"\n******************************\n"+
                date+"\n******************************\n           id: "+
                ID+"\n******************************";
    }
}

class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Factory fatory1 = new Factory("Factory1", new Date(), rand.nextInt(10000));
        println(fatory1+"\n");

        for (int i = 0; i < 50; i++) {
            if(i>=10)
                println("      "+i+"  '0"+i+"'  n°"+i+"  "+ rand.nextInt(20)+"dh");
            else
                println("      0"+i+"  '00"+i+"' n°"+i+"  "+rand.nextInt(20)+"dh");
        }
    }
}