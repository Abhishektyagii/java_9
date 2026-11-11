
import java.util.*;

public class Q15 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");

        set.remove("Python");

        System.out.println(set);
    }
}
