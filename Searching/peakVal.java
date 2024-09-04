public class peakVal {

    static int searchPeak(int a[]){
        int st =0, end = a.length;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(a[mid] < a[mid+1]){
                ans = mid+1;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {6,5,3,2,1,4,0};
        System.out.println(searchPeak(arr));
    }
}
