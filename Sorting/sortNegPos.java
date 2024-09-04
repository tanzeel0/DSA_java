public class sortNegPos {

    static int[] sort(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int j=0,k=n-1;
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                ans[j] = arr[i];
                j++;
            }
            if(arr[i] > 0){
                ans[k] = arr[i];
                k--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        int ans[] = sort(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
