public class arrayRecursion {
    static void recArray(int arr[],int ind){
        if(ind == arr.length) return;
        System.out.println(arr[ind]);  
        recArray(arr, ind+1);      
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 4, 3, 7};
        recArray(arr, 0);
    }
}