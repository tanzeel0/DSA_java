public class zeroOneTwoSort {
    static int[] sort(int arr[]){
        int n = arr.length;
        int low =0,mid =0,high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0,0};
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
