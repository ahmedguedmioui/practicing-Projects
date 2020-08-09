package Airport;

import java.util.InputMismatchException;
import java.util.Scanner;
import static print.print.*;

public class ShooseCountry {
    Scanner scan = new Scanner(System.in);
    Data data = new Data();
    Ticket ticket;

    void Show_ShooseCountry() {
        int choose_country;
        do {
            println("\nchoose a country :");
            println("--------------");
            for (int i=0, j=1; i < data.CountriesList.size(); i++)
                println(j++ + "- " + data.CountriesList.get(i).name);
            println("0- Exit");
            println("--------------");

            choose_country = scan.nextInt();

            if (choose_country == 0) return;

            if (choose_country == 1 || choose_country == 2 || choose_country == 3)
                Show_ShooseCities(choose_country - 1);

            if (choose_country > 3){
                println("Invalid choice");
            }
        } while (choose_country > 3);
    }
    void Show_ShooseCities(int index) {
        int choose_city;
        try {
            do {
                println("\nchoose a city :");
                println("--------------");
                for (int i = 0, j = 1; i < data.CountriesList.get(index).cities.size(); i++) {
                    println(j++ + "- " + data.CountriesList.get(index).cities.get(i));
                }
                println("0- Exit");
                println("--------------");

                choose_city = scan.nextInt();

                if (choose_city == 0) return;

                if (choose_city == 1) {
                    ticket = new Ticket(data.CountriesList.get(index).cities.get(choose_city - 1));
                    new Flight(ticket);
                }
                if (choose_city == 2) {
                    ticket = new Ticket(data.CountriesList.get(index).cities.get(choose_city - 1));
                    new Flight(ticket);
                }

                if (choose_city > 2) {
                    println("Invalid choice");
                }

            } while (choose_city > 2);
        } catch (InputMismatchException e) {
            println("please input a number");
        }
    }
}