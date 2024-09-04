import java.util.*;

public class reverse {

    public static void rev(Stack<Integer> s){
        if(s.size() == 1) return;
        int t = s.pop();
        rev(s);
        pushAtBottom(t,s);
    }
    public static void pushAtBottom(int t, Stack<Integer> s){
        if(s.size() == 0) {
            s.push(t);
            return;
        }
        int top = s.pop();
        rev(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.err.print("Enter the size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int t = sc.nextInt();
            st.push(t);
        }
        System.out.println(st);

        // Stack<Integer> rt = new Stack<>();
        // while(st.size() > 0){
        // rt.push(st.pop());      //iterative reverse
        // }

        // Stack<Integer> qt = new Stack<>();
        // while(rt.size() > 0){
        //     qt.push(rt.pop());
        // }

        // while (qt.size() > 0) {
        //     st.push(qt.pop());
        // }
        // System.out.println(st);

        rev(st);
        System.err.println(st);
    }
}
