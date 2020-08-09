package Airport;

import java.util.InputMismatchException;
import java.util.Scanner;
import static print.print.*;

public class Menu {
    Scanner scan = new Scanner(System.in);

    ShooseCountry country = new ShooseCountry();
    ShooseCity city = new ShooseCity();

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.hello();
    }

    void hello() {
        println("+------------+");
        println("| Welcome :) |");
        println("+------------+");
        GetChoice();
    }

    void GetChoice() {
        int choice;
        try {
            do {
                println("\nPlease choose by printing a number :");
                println("--------------");
                println("1- Country");
                println("2- City");
                println("0- Exit");
                println("--------------");

                choice = scan.nextInt();

                if (choice == 0) return;
                if (choice == 1) country.Show_ShooseCountry();
                if (choice == 2) city.Show_ShooseCity();

                if (choice > 2) {
                    println("Invalid choice");
                }
            } while (choice > 2);
        } catch (InputMismatchException e) {
            println("Please input a number");
        }
    }
}