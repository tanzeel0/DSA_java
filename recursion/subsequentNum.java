public class subsequentNum {
    static void subNum(int arr[],int idx,int n,int sum){
        if(idx == n) {
            System.out.println(sum);
            return;
        }
        subNum(arr, idx+1, n, sum+arr[idx]);
        subNum(arr, idx+1, n, sum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        subNum(arr, 0, arr.length, 0);
    }
}
