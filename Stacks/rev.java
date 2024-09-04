import java.util.Stack;
class rev {
    static void rev(Stack<Integer> s){
        if(s.size() == 1) return;
        int top = s.pop();
        //insertAtBottom(s, top);
        rev(s);
        insertAtBottom(s, top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        rev(st);
        System.out.println(st);
    }
    static void insertAtBottom(Stack<Integer> s,int n){
        if(s.size() == 0){
            s.push(n);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, n);
        s.push(top);
        rev(s);
        System.out.println(s);
    }
}