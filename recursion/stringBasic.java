import java.util.Scanner;
public class stringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(2));
        System.out.println(s);
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        String s1 = "college";
        String s2 = "wallah";
        s2 = s1 + s2;
        System.out.println(s2);
    }
}