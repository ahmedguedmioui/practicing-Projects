package Student;

import java.util.LinkedList;
import java.util.List;

public class Managment {
    public static void main(String[] args) {
        University university = new University();
        List<Student> students = new LinkedList<>();

        students.add(new Student("Khadija", 18, 70));
        students.add(new Student("Morad", 19, 52));
        students.add(new Student("Imad", 18, 81));
        students.add(new Student("Iman", 17, 36));
        students.add(new Student("Othman", 18, 50));
        students.add(new Student("Kawtar", 18, 47));

        for (int i = 0; i < students.size(); i++)
            if(students.get(i).getGrade() >= 50) {
                university.StudentsList.add(students.get(i));
            }

        university.AcceptedStudents();
        university.RankingStudents();

    }
}