
import java.util.*;

public class Q20 {
    public static void main(String[] args) {

        HashSet<Integer> h = new HashSet<>();
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        TreeSet<Integer> t = new TreeSet<>();

        int[] arr = {30, 10, 20, 40};

        for (int x : arr) {
            h.add(x);
            l.add(x);
            t.add(x);
        }

        System.out.println("HashSet: " + h);
        System.out.println("LinkedHashSet: " + l);
        System.out.println("TreeSet: " + t);
    }
}
