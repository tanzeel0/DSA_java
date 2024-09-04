import java.util.Stack;

public class evalutionPre {
    public static void main(String[] args) {
        String s = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if((int)ch >= 48 && (int)ch <= 57)
                val.push((int)ch - 48);
            else{
                int v1 = val.pop();
                int v2 = val.pop();
                if(ch == '+') val.push(v1+v2);
                if(ch == '-') val.push(v1-v2);
                if(ch == '*') val.push(v1*v2);
                if(ch == '/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
