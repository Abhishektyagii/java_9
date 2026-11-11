
import java.util.*;

public class Q30 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        list.add(10);
        list.add(20);

        set.add(30);
        set.add(40);

        queue.add(50);
        queue.add(60);

        System.out.println("Before Clearing:");
        System.out.println(list);
        System.out.println(set);
        System.out.println(queue);

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("After Clearing:");
        System.out.println(list);
        System.out.println(set);
        System.out.println(queue);
    }
}
