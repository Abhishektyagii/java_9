
import java.util.*;

public class Q23 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("First Element: " + pq.peek());

        System.out.println("Queue: " + pq);
    }
}
