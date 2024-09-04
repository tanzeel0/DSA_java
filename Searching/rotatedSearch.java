public class rotatedSearch {
    static int searchTarget(int arr[], int t){
        int st=0,end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(t == arr[mid]){
                return mid;
            }
            else if(arr[mid] < arr[end]){
                if(t > arr[mid] && t <= arr[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
            else {
                if(t >= arr[st] && t < arr[mid]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int tgt = 1;
        System.out.println(searchTarget(arr, tgt));
    }
}
