package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "John", "123 Main St"));
        students.add(new Student(102, "Alice", "456 Park Ave"));
        students.add(new Student(103, "Bob", "789 Oak Ln"));
        students.add(new Student(104, "Charlie", "987 Pine Rd"));
        students.add(new Student(105, "David", "654 Elm Blvd"));
        students.add(new Student(106, "Eva", "321 Cedar Dr"));
        students.add(new Student(107, "Frank", "876 Maple Ave"));
        students.add(new Student(108, "Grace", "234 Birch Ln"));
        students.add(new Student(109, "Hank", "567 Spruce Rd"));
        students.add(new Student(110, "Ivy", "890 Fir Blvd"));

        System.out.println("Before sorting:");
        printStudents(students);

        // Sort by name
        selectionSort(students, new StudentComparatorByName());
        System.out.println("\nAfter sorting by name:");
        printStudents(students);

        // Sort by roll number
        selectionSort(students, new StudentComparatorByRollNo());
        System.out.println("\nAfter sorting by roll number:");
        printStudents(students);
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static <T> void selectionSort(List<T> list, Comparator<? super T> comparator) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
