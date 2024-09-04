public class ZeroOneSort {
    static int countzero(int arr[]){
        int zeros =0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        return zeros;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0,1};
        int zero = countzero(arr);
        for(int i=0; i<zero; i++){
            arr[i] =0;
        }
        for(int i=zero; i<arr.length; i++){
            arr[i] =1;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
