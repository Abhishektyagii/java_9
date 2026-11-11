
import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Q27 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Priya"));
        list.add(new Student(1, "Anshika"));
        list.add(new Student(2, "Rahul"));

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.roll - s2.roll;
            }
        });

        for (Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }
    }
}
