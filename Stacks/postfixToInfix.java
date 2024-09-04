import java.util.Stack;

public class postfixToInfix {
    public static void main(String[] args) {
        String s = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((int)ch >= 48 && (int)ch<= 57){
                String v = "" + ch;
                st.push(v);
            }
            else{
                String v2 = st.pop();
                String v1 = st.pop();
                char o = ch;
                String t = v1+o+v2;
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
