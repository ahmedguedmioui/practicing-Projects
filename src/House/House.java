package House;

import static print.print.*;
interface House {
    interface BedRoom extends House { void sleep(); }
    interface LivingRoom extends House { void eat(); }
    interface Kitchen extends House { void MakeFood(); }
    interface BethRoom extends House { void shower(); }
}
interface Service { House GetHouse(); }

class MyHouse implements House.BedRoom, House.BethRoom, House.Kitchen, House.LivingRoom {
    public void sleep() {
        println("I'm in my house, and I'm sleeping in my bedroom");
    }
    public void eat() {
        println("I'm in my house, and I'm eating in my livingroom");
    }
    public void MakeFood() {
        println("I'm in my house, and I'm making food in my kitchen");
    }
    public void shower() {
        println("I'm in my house, and I'm taking a shower in my bethroom");
    }
}
class MyHouseFactory implements Service {
    public House GetHouse() {
        return new MyHouse();
    }
}
class LiveInHouse {
    public static void LetsLive(MyHouseFactory m) {
        House.LivingRoom l = (House.LivingRoom) m.GetHouse();
        House.Kitchen k = (House.Kitchen) m.GetHouse();
        House.BethRoom bt = (House.BethRoom) m.GetHouse();
        House.BedRoom b = (House.BedRoom) m.GetHouse();

        l.eat();
        k.MakeFood();
        bt.shower();
        b.sleep();
    }

    public static void main(String[] args) {
        LetsLive(new MyHouseFactory());
    }
}