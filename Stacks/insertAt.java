import java.util.*;
public class insertAt {

    static void displayRecRev(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        System.out.print(top + " ");
        displayRecRev(s);
        //System.out.print(top + " ");
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter idx to be inserted onto : ");
        int idx = sc.nextInt();
        System.out.print("Enter Element: ");
        int n = sc.nextInt();
        Stack<Integer> gt = new Stack<>();
        while(st.size() > idx){
            gt.push(st.pop());
        }
        st.push(n);
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
        System.out.println(st); 


        //display Stack
        //using stack
        Stack<Integer> rt = new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        while(!rt.isEmpty()){
            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x);        
        }
        System.out.println();


        //using array
        int s = st.size();
        int[] arr = new int[s];
        for(int i=s-1; i>=0; i--){
            arr[i] = st.pop();
        }
        for(int i : arr){
            System.out.print(i + " ");
            st.push(i);
        }
        System.out.println();
        System.out.println(st);


        //display recursive Reverse
        displayRecRev(st);
        insertAtBottom(st,6);
        System.out.println(st);
    }
    static void insertAtBottom(Stack<Integer> s,int n){
        Stack<Integer> st = new Stack<>();
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        s.push(n);
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    }
}
