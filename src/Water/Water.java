package Water;

import java.util.Scanner;
import static print.print.*;

public class Water {
    int controler;
    public static void main(String[] args) {
        Water w = new Water();
        Scanner scan = new Scanner(System.in);

        Thread t1 = new Thread(() -> {
            while (w.controler > 0) {
                try { w.controler = scan.nextInt(); }
                catch (Exception e){
                    println("Miss input Exception!");
                    w.controler = 0;
                }
            }
        }, "set drops Thread");

        Thread t2 = new Thread(() -> {
            while (w.controler > 0) {
                println(" "+w.controler);
                try { Thread.sleep(500); }
                catch (InterruptedException e) {}
            }
        }, "get drops Thread");

        t1.setPriority(t1.MAX_PRIORITY);
        t2.setPriority(t2.MIN_PRIORITY);

        println("- "+t1.getName()+" -> MAX_PRIORITY"+ "\n"+
                "- "+t2.getName()+" -> MIN_PRIORITY");

        print("drops of water : ");
        try { w.controler = scan.nextInt(); }
        catch (Exception e){
            println("Miss input Exception!");
        }

        t1.start();
        t2.start();
    }
}