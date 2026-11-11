
import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Q26 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Anshika"));
        list.add(new Student(2, "Rahul"));
        list.add(new Student(3, "Priya"));

        Iterator<Student> itr = list.iterator();

        while (itr.hasNext()) {
            itr.next().display();
        }
    }
}
