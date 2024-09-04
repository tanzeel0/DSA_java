import java.util.Scanner;

public class stringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();

        for(int i=1; i<c.length; i++){
            int j=i;
            while(j > 0 && c[j] < c[j-1]){
                char temp = c[j];
                c[j] = c[j-1];
                c[j-1] = temp;
                j--;
            }
        }
        String ans = "";
        for(int i=0; i<c.length; i++){
            ans+=c[i];
        }
        System.out.println(ans);

    }
}
