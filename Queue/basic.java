import java.util.LinkedList;
import java.util.Queue;
class basic{
    public static void main(String[] args) {
        //Queue<Integer> q = new ArrayDeque();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // q.poll();
        // System.out.println(q);
        // System.out.println(q.element());

        //display
        System.out.println(q);
        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }


    }
}