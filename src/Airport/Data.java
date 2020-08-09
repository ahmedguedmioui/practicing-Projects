package Airport;

import java.util.ArrayList;
public class Data {
    ArrayList<Countries> CountriesList = new ArrayList<>();

    Data () {
        CountriesList.add(new Countries("UAE"));
        CountriesList.add(new Countries("England"));
        CountriesList.add(new Countries("France"));

        CountriesList.get(0).cities.add("Dobie");
        CountriesList.get(0).cities.add("AbouDabi");

        CountriesList.get(1).cities.add("London");
        CountriesList.get(1).cities.add("Manchester");

        CountriesList.get(2).cities.add("Paris");
        CountriesList.get(2).cities.add("Monaco");
    }
}
