import java.util.*;

public class mapInterface {

    static void hashmap(){
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");
        mp.putIfAbsent(2,"Soniya");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Riya"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        for(var i: mp.values()) System.out.println(i);

        for(var e: mp.entrySet()) System.out.println(e);
    }
    public static void main(String[] args) {
        hashmap();
    }
}
