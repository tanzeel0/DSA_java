import java.util.*;
public class binarySearch{
    static Boolean search(int a[],int t){
        int st=0, n = a.length-1;
        while(st<=n){
            int mid = (st+n)/2;
            if(t == a[mid]){
                return true;
            }
            else if(t < a[mid]){
                n = mid-1;
            }else{
                st = mid+1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,7,15,20,24,45,50,77};
        System.out.print("Enter Target: ");
        int t = sc.nextInt();
        System.out.println(search(arr, t));
    }
}