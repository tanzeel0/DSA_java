public class peakVal {
    public static void main(String[] args) {
        int arr[] = {1,1,2,4,3,5,7,0};

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                
            }
        }
    }
}
