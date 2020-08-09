package Student;

public class Student {
    private String name;
    private int age;
    private long grade;

    Student(String name, int age, long grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    String getName() { return name; }
    int getAge() { return age; }
    long getGrade() { return grade; }

    public String toString() {
        return grade+" --> "+name;
    }

}