public class isSorted {
    static boolean sorted(int arr[],int idx){
        if(idx == arr.length-1) return true;
        //if(arr[idx] < arr[idx+1]) return true;
        //return sorted(arr, idx+1);
        return arr[idx] < arr[idx+1] && sorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,4};
        int arr2[] = {5,3,2,1,4};
        System.out.println(sorted(arr1, 0));
    }
}
