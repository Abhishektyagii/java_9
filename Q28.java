
import java.util.*;

public class Q28 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        Set<Integer> set = new HashSet<>(list);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
    }
}
