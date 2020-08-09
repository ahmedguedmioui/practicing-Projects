package Pets;

public interface Pet {}

class Cat implements Pet {
    private String name;
    Cat(String name) {
        this.name = name;
    }
    public String toString() {
        return "cat "+name;
    }
}

class Dog implements Pet {
    private String name;
    Dog(String name) {
        this.name = name;
    }
    public String toString() {
        return "dog "+name;
    }
}

class Bird implements Pet {
    private String name;
    Bird(String name) {
        this.name = name;
    }
    public String toString() {
        return "bird "+name;
    }
}