import java.util.Scanner;
public class findTarget {
    static boolean targetNum(int arr[], int idx,int n){
        if(idx > arr.length-1) return false;
        if(arr[idx] == n) return true;
        return targetNum(arr, idx+1, n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,12,54,14,3,8,6,1};
        int t = sc.nextInt();
        System.out.println(targetNum(arr, 0, t));
        
    }
}
