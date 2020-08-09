package Car2;

import java.util.Scanner;
import static print.print.*;

public class Car2 {
    static Car2 car = new Car2();
    private boolean engine;
    private int speed;
    private int fuel;
    private int incSpeed = 0;

    static Thread myCar = new Thread(()-> {
        int dicSpeed;

        while (car.engine) {
            if(car.incSpeed < car.speed)
                println(car.incSpeed+++" km");
            else println(car.speed+" km");
            try { Thread.sleep(500); }
            catch (Exception e) {}
        }
        dicSpeed = car.incSpeed;
        while (!car.engine) {
            if(car.speed == 0)
                break;
            println(--dicSpeed +" km");
            car.speed = dicSpeed;
            try { Thread.sleep(500); }
            catch (Exception e) {}
        }
    });
    static Thread Flue = new Thread(()->{
        for (int i = car.fuel; i >= 0; i--) {
            car.fuel = i;
            try { Thread.sleep(1000); }
            catch (Exception e) {}
        }
    });
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        print("set your speed : ");
        car.speed = scan.nextInt();

        car.fuel = 50;
        car.engine = true;
        myCar.start();
        Flue.start();

        Flue.join();
        println("NO FLUE!");
        car.engine = false;
        myCar.join();
        println("car is stoped");
        System.exit(0);
    }
}