import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.add(3);
        dq.addFirst(2);
        // System.out.println(dq);
        // dq.removeLast();
        // System.out.println(dq);
        // dq.removeFirst();
        // System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());

        dq.add(5); // last
        //dq.remove(); // first
        dq.removeLastOccurrence(2);
        System.out.println(dq);
        //dq.removeAll(dq);
        //dq.addAll(dq);
        
        System.out.println(dq);
    }
}
