package Zoo2;

public interface Food {}

class FoodOfLion implements Food {}
class FoodOfBear implements Food {}

class FoodFor {
    int counter = -1;
    Food getFood(Food food) {
        counter++;
        Food[] listOfFood = {food, food, food};

        if (counter <= 2)
            return listOfFood[counter];
        else
            return null;
    }
}