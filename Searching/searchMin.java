public class searchMin {
    static int findMIN(int arr[]){
        int st = 0,end = arr.length-1;
        int ans = 5000;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] > arr[end]){
                st = mid+1;
            }
            else if(arr[mid] <= arr[end]){
                if(ans > arr[mid]){
                ans = arr[mid];
                }
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        System.out.println(findMIN(arr));

    }
}
