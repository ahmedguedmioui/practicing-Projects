package Airport;

import java.util.InputMismatchException;
import java.util.Scanner;
import static print.print.*;

public class ShooseCity {
    Scanner scan = new Scanner(System.in);
    Data data = new Data();
    Ticket ticket;

    void Show_ShooseCity() {
        int choose_city;
        int y = 1;

       try {
           do {
               println("\nchoose a city :");
               println("--------------");
               for (int i = 0; i < data.CountriesList.size(); i++) {
                   println(data.CountriesList.get(i).name + ":");
                   for (int j = 0; j < data.CountriesList.get(i).cities.size(); j++)
                       println(y++ + "- " + data.CountriesList.get(i).cities.get(j));
                   println("--------------");
               }
               println("0- Exit");
               println("--------------");

               choose_city = scan.nextInt();

               if (choose_city == 0) return;

               if (choose_city == 1) {
                   ticket = new Ticket(data.CountriesList.get(0).cities.get(0));
                   new Flight(ticket);
               }
               if (choose_city == 2) {
                   ticket = new Ticket(data.CountriesList.get(0).cities.get(1));
                   new Flight(ticket);
               }
               if (choose_city == 3) {
                   ticket = new Ticket(data.CountriesList.get(1).cities.get(0));
                   new Flight(ticket);
               }
               if (choose_city == 4) {
                   ticket = new Ticket(data.CountriesList.get(1).cities.get(1));
                   new Flight(ticket);
               }
               if (choose_city == 5) {
                   ticket = new Ticket(data.CountriesList.get(2).cities.get(0));
                   new Flight(ticket);
               }
               if (choose_city == 6) {
                   ticket = new Ticket(data.CountriesList.get(2).cities.get(1));
                   new Flight(ticket);
               }

               if (choose_city > 6) {
                   println("Invalid choice");
                   y = 0;
               }

           } while (choose_city > 6);
       } catch (InputMismatchException e) {
           println("please input a number");
       }
    }
}