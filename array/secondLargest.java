import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        int mx= Integer.MIN_VALUE;
        int ans =Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt(); 
        }

        for(int i=0; i<n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
      //  for(int i=0; i<n; i++){
       //     System.out.print(arr[i] + " ");
      //  }

        for(int i=0; i<n; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

       
        System.out.println("SecondLargest " + ans);
    }
}
