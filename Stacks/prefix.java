import java.util.Stack;

public class prefix {
    public static void main(String[] args) {
        String s = "9-(5+3)*4/6";                //solve on papper
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii >= 48 && ascii<= 57){
                String v = ""+ch;
                val.push(v);
            }
            else if(op.size() == 0 || ch == '(' || op.peek() == '(')
                op.push(ch);
                else if(ch == ')'){
                while(op.peek() != '('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =op.pop(); 
                    String t = o+v1+v2;
                    val.push(t);

                }
                op.pop();
            }

            else {
                if(ch == '+' || ch == '-') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =op.pop(); 
                    String t = o+v1+v2;
                    val.push(t);
                    op.push(ch);
                }
            
                if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =op.pop(); 
                    String t = o+v1+v2;
                    val.push(t);
                    op.push(ch);
                    }
                    else op.push(ch);
                }
            }
            
        }
        while(op.size()>0){
            String v2 = val.pop();
            String v1 = val.pop();
            char o =op.pop(); 
            String t = o+v1+v2;
            val.push(t);
        }

        System.out.println(val.peek());
    }
}
