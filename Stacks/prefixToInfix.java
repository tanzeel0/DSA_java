import java.util.Stack;

public class prefixToInfix {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if((int)ch >= 48 && (int)ch <= 57){
                String v = "" + ch;
                st.push(v);
            }
            else{
                String v1 = st.pop();
                String v2 = st.pop();
                char op = ch;
                String t = v1 +op +  v2;
                st.push(t);
            }
        }
        System.out.println(st.peek());
    }
}
