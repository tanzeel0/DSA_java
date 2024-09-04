public class oddEvenSwap {

    static void swap(int arr[],int i,int j){
        int n= arr.length;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[]){
        int n = arr.length;
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]%2==0 && arr[r]%2==1){
                swap(arr, l, r);
                l++;
                r--;
            }
            if(arr[l]%2 ==1){
                l++;
            }
            if(arr[r]%2== 0){
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        sort(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
