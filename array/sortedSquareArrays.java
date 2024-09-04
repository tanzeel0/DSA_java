public class sortedSquareArrays{
    static int[] reverseArr(int []arr){
        int n=arr.length;
        int []ans = new int[n];
        int i=n-1,j=0;
        while(i>=0){
            ans[j++] = arr[i--];
        }
        return ans;
    }

     static int[] sortSquare(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int l=0,r=n-1;
        int k=0;

        while(l<=r){
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                ans[k++] = arr[l] * arr[l];
                l++;
            }
            else{
                ans[k++] = arr[r] * arr[r];
                r--;
            }
        }
       return ans;
    } 

    public static void main(String[] args) {
        int arr[] = {-10,-3,-2,1,4,5};
        int n = arr.length;
      

    int[] abc = sortSquare(arr);
     int[] ans = reverseArr(abc);

        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}