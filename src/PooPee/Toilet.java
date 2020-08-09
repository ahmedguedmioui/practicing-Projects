package PooPee;

import static print.print.*;
public class Toilet {

    synchronized void toilet(PeePoo p) {
        synchronized (p) {
            if (p instanceof Pee) pee((Pee) p);
            if (p instanceof Poo) poopee((Poo) p, new Pee());
        }
    }
    
    synchronized void pee(Pee p) {
        println("peeing! ---------> "+p.getClass().getSimpleName());
    }

    void poopee(Poo poo, Pee pee) {
        println("pooping! -> "+poo.getClass().getSimpleName());
        println("peeing! ->"+(Pee)pee);
    }

    public static void main(String[] args) {
        Toilet t = new Toilet();

        Thread pee = new Thread(() -> {
            t.toilet(new Pee());
        }
        );
        Thread poopee = new Thread(() -> {
            t.toilet(new Poo());
        }
        );
        poopee.start();
        pee.start();
    }
}

interface PeePoo {}
class Pee implements PeePoo {}
class Poo implements PeePoo {}