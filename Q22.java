
import java.util.*;

public class Q22 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
