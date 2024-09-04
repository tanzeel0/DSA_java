import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println(l1);
        //System.out.println(l1.get(1));

        l1.add(1,100);
        System.out.println(l1);

        l1.set(1, 10);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(7)));

        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(7)));

        for(int i=0; i<l1.size();i++){
            System.out.print(l1.get(i) + " ");
        }

        Boolean ans = l1.contains(Integer.valueOf(7));
        System.out.println(ans);

        ArrayList a = new ArrayList();
        a.add(8);
        a.add("ab");
        a.add(true);
        System.out.println(a);
    }
}
