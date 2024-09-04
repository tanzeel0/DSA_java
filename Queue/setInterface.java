import java.util.*;

public class setInterface {

    static void hashset(){
        //HashSet<Integer> h = new HashSet<>();
        //LinkedHashSet<Integer> h = new LinkedHashSet<>();
        TreeSet<Integer> h = new TreeSet<>(Comparator.reverseOrder());
        h.add(3);
        h.add(1);
        h.add(2);
        h.add(8);
        System.out.println(h);
    }
    public static void main(String[] args) {
        hashset();
    }
}
