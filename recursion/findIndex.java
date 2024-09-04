import java.util.Scanner;
public class findIndex {
    static int index(int arr[],int idx,int tr){
        if(idx == arr.length) return -1;
        if(arr[idx] == tr) return idx;
        return index(arr, idx+1, tr);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,12,54,14,3,8,54,1};
        int tr = sc.nextInt();
        System.out.println(index(arr, 0, tr));
    }
}
