package Zoo;

interface Animal {
    Sounds MakesNoise();
    void feed(Food f);
}
class Lion implements Animal {
    private String kind = "lion";
    public Sounds MakesNoise() {return Sounds.ROAR;}
    public void feed(Food f) {
        if(f == null) System.out.println("No more food for Lion!");
        else System.out.println("lion is eating " + f);
    }
}
class Sheep implements Animal {
    private String kind = "sheep";
    public Sounds MakesNoise() {return Sounds.BAA;}
    public void feed(Food f) {
        if(f == null) System.out.println("No more food for Sheep!");
        else System.out.println("sheep is eating " + f);
    }
}
class Bear implements Animal {
    private String kind = "bear";
    public Sounds MakesNoise() {return Sounds.GROWL;}
    public void feed(Food f) {
        if(f == null) System.out.println("No more food for Bear!");
        else System.out.println("bear is eating " + f);
    }
}
class Owl implements Animal {
    private String kind = "owl";
    public Sounds MakesNoise() {return Sounds.HOOL;}
    public void feed(Food f) {
        if(f == null) System.out.println("No more food for Owl!");
        else System.out.println("owl is eating " + f);
    }
}