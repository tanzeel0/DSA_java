import java.util.Scanner;

public class upperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' ') continue;
            if((int)ch >= 97){
                ch -=32;
            }else{
                ch +=32;
            }
            System.out.print(ch);
        }
    }
}
