package Contacts;

public class Person {
    private String name;
    private Integer PhoneNumber;

    Person(String name, Integer PhoneNumber) {
        this.name = name;
        this.PhoneNumber = PhoneNumber;
    }

    void Setname(String name) {
        this.name = name;
    }

    void Setphone(Integer PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    String Getname() {
        return this.name;
    }

    Integer Getphone() {
        return this.PhoneNumber;
    }
}

class ME extends Person {
    ME(String name, Integer PhoneNumber) {
        super(name, PhoneNumber);
    }
}