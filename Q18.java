
import java.util.*;

public class Q18 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Contains 50: " + set.contains(50));
    }
}
