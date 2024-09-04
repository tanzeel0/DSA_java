import java.util.*;
class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int mx = 0;
        int secmx = 0;

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        System.out.println("max val: " + mx);

        for(int i=0; i<n; i++){
           if(secmx < mx && arr[i] > secmx){
            secmx = arr[i];
           }
        }
        System.out.println("second max: " + secmx);
    }
}
