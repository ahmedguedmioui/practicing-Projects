package Compete;

import java.util.*;
import static print.print.*;

public class Compete {

    static Random rand = new Random();
    static Map<Integer, Person> people = new HashMap<>();

    static void getWinner() {
        int winner = rand.nextInt(1000000);

        if (people.containsKey(winner))
            println("the winner is " + people.get(winner) +" -> "+winner);

        else getWinner();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++)
            people.put(i, new Person());
        getWinner();
    }
}

class Person {}