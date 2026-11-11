
import java.util.*;

public class Q04 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.remove(1);
        list.remove(Integer.valueOf(40));

        System.out.println("After Removing: " + list);
    }
}
