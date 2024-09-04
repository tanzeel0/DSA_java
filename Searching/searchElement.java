public class searchElement {
    static boolean search(int arr[], int t){
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(t == arr[mid]){
                return true;
            }
            else if(arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;end--;
            }
            else if(arr[st] <= arr[mid]){
                if(arr[st] <= t && arr[mid] > t){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{
                if(arr[mid] < t && arr[end] >= t){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,2,2,3,1};
        System.out.println(search(arr, 4));

    }
}
