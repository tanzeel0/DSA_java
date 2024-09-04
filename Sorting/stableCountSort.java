public class stableCountSort {

    static void Sort(int arr[]){
        //find max num present in array
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        //freq array
        int [] count = new int[mx+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,2,5};
        Sort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
