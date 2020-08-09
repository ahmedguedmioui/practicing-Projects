package Zoo;

public class Robot {
    Feed lion = new Feed(); Feed sheep = new Feed();
    Feed bear = new Feed(); Feed owl = new Feed();
    void FeedAnimal(Sounds s, Animal a) {
        if(s == Sounds.ROAR) a.feed(lion.ReturnFood(Food.MEAT));
        if(s == Sounds.BAA) a.feed(sheep.ReturnFood(Food.HERBS));
        if(s == Sounds.GROWL) a.feed(bear.ReturnFood(Food.HONEY));
        if(s == Sounds.HOOL) a.feed(owl.ReturnFood(Food.INSECTS));
    }
    public static void main(String[] args) {
        Robot robot = new Robot();

        Lion lion = new Lion();
        Sheep sheep = new Sheep();


        robot.FeedAnimal(lion.MakesNoise(), lion);
        robot.FeedAnimal(lion.MakesNoise(), lion);
        robot.FeedAnimal(lion.MakesNoise(), lion);
        robot.FeedAnimal(lion.MakesNoise(), lion);

    }
}