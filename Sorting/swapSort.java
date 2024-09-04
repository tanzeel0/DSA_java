public class swapSort{

    static int[] sort(int arr[]){
        int n = arr.length;
        int p = 0,q=0;
        if(n<= 1) return arr;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                if(p == 0){
                    p = i;
                    q = i+1;
                }else{
                    q = i+1;
                }
                
            }
        }
            int temp = arr[p];
            arr[p] = arr[q];
            arr[q] = temp;
            
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 6, 7, 5, 9, 10};
        int ans[] = sort(arr);
        for(int val : ans){
            System.out.println(val);
        }
    }
}