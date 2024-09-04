import java.util.Scanner;
import java.util.Stack;

public class removeBraces {

    static String check(String s){
        Stack<Character> open = new Stack<>();
        Stack<Character> close = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open.push('(');
            }
            else{
                close.push(')');
            }
        }
        String ans = "";
        for(int i=0; i<s.length(); i++){
            if(!open.isEmpty() && !close.isEmpty()){
                ans += open.pop();
                ans += close.pop();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(check(str));
    }
}
