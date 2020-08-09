package Zoo2;

import static print.print.*;

public class Robot {

    //-----------------------------------------------------------------------------------
    Animal lion = new Animal() {
        public Sound isHangry() {
            return new SoundOfLion();
        }

        public void TakeFood(Food food) {
            if (food == null) {
                println("no more food for lion");
                return;
            }
            println("lion is eating " + food.getClass().getSimpleName());
        }
    };
    Animal bear = new Animal() {
        public Sound isHangry() {
            return new SoundOfBear();
        }

        public void TakeFood(Food food) {
            if (food == null) {
                println("no more food for bear");
                return;
            }
            println("bear is eating " + food.getClass().getSimpleName());
        }
    };
//-----------------------------------------------------------------------------------

    FoodFor forLion = new FoodFor();
    FoodFor forBear = new FoodFor();

    void FeedAnimal(Sound sound, Animal animal) {
        if (sound instanceof SoundOfLion)
            animal.TakeFood(forLion.getFood(new FoodOfLion()));

        if (sound instanceof SoundOfBear)
            animal.TakeFood(forBear.getFood(new FoodOfBear()));
    }

    public static void main(String[] args) {
        Robot robot = new Robot();

        Animal LionAnimal = robot.lion;
        Animal BearAnimal = robot.bear;

        robot.FeedAnimal(BearAnimal.isHangry(), BearAnimal);
        robot.FeedAnimal(BearAnimal.isHangry(), BearAnimal);
        robot.FeedAnimal(BearAnimal.isHangry(), BearAnimal);
        robot.FeedAnimal(BearAnimal.isHangry(), BearAnimal);
        println();

        robot.FeedAnimal(LionAnimal.isHangry(), LionAnimal);
        robot.FeedAnimal(LionAnimal.isHangry(), LionAnimal);
        robot.FeedAnimal(LionAnimal.isHangry(), LionAnimal);
        robot.FeedAnimal(LionAnimal.isHangry(), LionAnimal);
    }
}