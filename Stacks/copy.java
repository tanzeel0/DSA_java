import java.util.*;
public class copy {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number you want to Insert: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //reverse
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            //int x = st.peek();
            rt.push(st.pop());
            //st.pop();
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);

        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
