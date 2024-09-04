public class findIndices {
    static void indices(int arr[], int idx, int tr){
        if(idx > arr.length-1) return;
        if(arr[idx] == tr) System.out.println(idx);
        indices(arr, idx+1, tr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,5};
        indices(arr, 0, 2);
    }
}
