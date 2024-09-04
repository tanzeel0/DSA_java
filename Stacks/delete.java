import java.util.*;
public class delete {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idx to be deleetd : ");
        int idx = sc.nextInt();
        
        
        Stack<Integer> s = new Stack<>();
        while(st.size() > idx){
            s.push(st.pop());
        }
        st.pop();
        while(!s.empty()){
            st.push(s.pop());
        }

        System.out.println(st);
    }
}

