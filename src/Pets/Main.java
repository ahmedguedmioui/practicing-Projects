package Pets;

import java.util.*;
import static print.print.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> garden = new HashMap<>();
        List<Pet> List1 = Arrays.asList(new Cat("meme"), new Dog("lucas"));
        List<Pet> List2 = Arrays.asList(new Cat("mojo"), new Dog("lola"), new Bird("boo"));
        List<Pet> List3 = Arrays.asList(new Cat("peto"));

        garden.put(new Person("Alex"), List1);
        garden.put(new Person("Kitty"), List2);
        garden.put(new Person("Anwar"), List3);

        for (Person person : garden.keySet()) {
            print(person+" has ");
            for (Pet pet : garden.get(person))
                print("a "+pet+" ");
            println();
        }
    }
}