
import java.util.*;

public class Q29 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");

        ArrayList<String> list = new ArrayList<>(set);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
