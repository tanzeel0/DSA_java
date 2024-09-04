public class lastTarget {
    static int lastIndex(int arr[],int idx,int tr){
        if(idx == -1) return -1;   
        if(arr[idx] == tr) return idx;     
        return lastIndex(arr, idx-1, tr);        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,2,2,5};
        System.out.println(lastIndex(arr, arr.length-1, 2));
    }
}
