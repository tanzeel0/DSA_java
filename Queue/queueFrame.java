import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queueFrame {    
        static void queueExample(){
            LinkedList<Integer> q = new LinkedList<>();
            q.add(5);
            q.add(6);
            q.add(1);
            q.add(2);
            System.out.println(q);
            System.out.println(q.poll());
            System.out.println(q);
        }

        static void priorityQueue(){
            //PriorityQueue<Integer> pq= new PriorityQueue<>(); // min
            PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder()); // max

            pq.add(10);
            pq.add(5);
            pq.add(7);
            System.out.println(pq);
            System.out.println(pq.poll());
            System.out.println(pq);
        }
    
    public static void main(String[] args) {
        //queueExample();
        priorityQueue();
    }
}
