package Student;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import static print.print.*;

public class University {
    List<Student> StudentsList = new LinkedList<>();

    void AcceptedStudents() {
        for(Student s : StudentsList)
            println(s+"\n--------------");
        println("\n****************************\n");
    }
    void RankingStudents() {
        int i= 1;
        Collections.sort(StudentsList,  (o1, o2) -> {
            return o1.getGrade() < o2.getGrade() ? 1 : o1.getGrade() > o2.getGrade() ? -1 : 0;
        } );
        for(Student s : StudentsList) {

            println(i++ +" - "+s + "\n--------------");
        }
    }
}