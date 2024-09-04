public class sortNegative {
    static int[] sort(int arr[]){
        int n = arr.length;
        int l=0,r=n-1;
        while(l<r){
            if(arr[l] > 0 && arr[r] < 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;r--;
            }
            if(arr[l] < 0) l++;
            if(arr[r] > 0) r--;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        int ans[] = sort(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
