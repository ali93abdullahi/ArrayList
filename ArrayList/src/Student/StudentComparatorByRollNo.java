package Student;

import java.util.Comparator;

public class StudentComparatorByRollNo implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
