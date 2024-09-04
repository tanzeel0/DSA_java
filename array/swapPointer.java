public class swapPointer {
    static void swap(int arr[],int i,int j){
       
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[]){
        int n = arr.length;
        int l=0,r=n-1;
        while(l<r){
            if(arr[l] == 1 && arr[r] == 0){
                swap(arr, l, r);
                l++;
                r--;
            }
            if(arr[l] ==0){
                l++;
            }
            if(arr[r] == 1){
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,1,1,0};
        sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
