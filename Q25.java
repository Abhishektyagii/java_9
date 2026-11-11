
import java.util.*;

public class Q25 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);
        System.out.println("Peek: " + q.peek());

        q.remove();

        System.out.println("After Remove: " + q);
    }
}
