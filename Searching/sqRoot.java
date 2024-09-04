import java.util.Scanner;
public class sqRoot {
    static int findRoot(int x){
        int end = x,y=0;
        while(y*y <= x){
            int mid = y + (end - y)/2;
            int val = mid*mid;
            if(val == x){
                return mid;
            }
            else if(val > x){
                end = mid-1;
            }
            else{
                y = mid+1;
            }
        }

        return y-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

       /*  int n =0;
        while(n*n <= s){
            n++;
        }
        System.out.println(n-1);*/
        System.out.println(findRoot(x));
    }
}
