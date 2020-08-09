package Zoo;

class Feed {
    int counter = -1;
    Food ReturnFood(Food f) {
        counter++;
        Food[] food = {f, f, f};
        if(counter <= 2) return food[counter];
        else return null;
    }
}