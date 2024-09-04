import java.util.*;
public class countTimesTripplets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        
        
        System.out.println("enter elemts: ");
        int arr[] = new int [n];
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();
        int times=0;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == t){
                        times++;
                        System.out.println("[" + arr[i] + " " + arr[j] + " " + arr[k]+ "]");
                       // System.out.println("first num " + arr[i]);
                        // System.out.println("Second num" + arr[j]);
                        // System.out.println("Third num " + arr[k]);
                    }
                }
            }
        }
        System.out.println("No of times " + times);
    }
}