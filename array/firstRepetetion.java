import java.util.*;
public class firstRepetetion {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =0;
        int arr[] = new int[n];
        int index=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    ans = arr[i];
                    index = i;
                    n=0;
                }
            }
        }
        System.out.println("element " + ans);
        System.out.println("index " + index);
    }
}
