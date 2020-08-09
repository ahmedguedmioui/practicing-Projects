package Quetion;

import java.util.Scanner;

public class Quetion {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            
            public void run() {
                String rightAnswer = "me";
                System.out.print("who are you?\n- ");
                String answer = new Scanner(System.in).next();
                if(answer.equalsIgnoreCase(rightAnswer)) {
                    System.out.println("YES!!");
                    System.exit(0);
                }
                else {
                    System.out.println("No :(");
                    System.exit(0);
                }
            }
        });
        t.start();

        t.join(5000);
        System.out.println("no more time");
        System.exit(0);
    }
}