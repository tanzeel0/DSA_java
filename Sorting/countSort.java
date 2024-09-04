public class countSort {
    static void basicSort(int arr[]){
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
        int k=0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,2,5};
        basicSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
