
import java.util.*;

public class Q24 {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("Apple");
        q.add("Banana");
        q.add("Mango");

        System.out.println("Queue: " + q);

        q.remove();

        System.out.println("After Remove: " + q);
    }
}
