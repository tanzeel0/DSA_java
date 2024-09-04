public class strictlyPeakVal {

    static int searchPeak(int a[]){
        int n = a.length, low = 0, high = n - 1;
        if (n == 1)
            return 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0) {
                if (a[mid] > a[mid+1])
                    return 0;
                else
                    return 1;
            } else if (mid == n - 1) {
                if (a[mid-1] > a[mid-2])
                    return n - 1;
                else
                    return n - 2;
            } else {
                if (a[mid] > a[mid-1] && a[mid] > a[mid+1])
                    return mid;
                else if (a[mid] > a[mid-1])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
  
  
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,5,6,4};
        System.out.println(searchPeak(arr));
    }
}
