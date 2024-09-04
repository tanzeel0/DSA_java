import java.util.*;

public class reverseKelements {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int k = 3;

        Stack<Integer>st = new Stack<>();
        for(int i=0; i<k; i++){
            st.push(q.remove());
        }

        while(st.size() != 0){
            q.add(st.pop());
        }
        for(int i=q.size(); i>k; i--){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
