public class range {
    static int[] searchMiss(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int ans[] = new int[max+5];
        int i=1;
        while(i<max){
            for(int j=0; j<arr.length; j++){
                if(i != arr[j]){
                    ans[i++] = arr[j];
                }else{
                    ans[i++] = 0;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,7,8,2,1};
        int ans[] = searchMiss(arr);
        for(int i=0; i<ans.length; i++){
            if(ans[i] != 0){
                System.out.println(ans[i]);
            }
        }
    }
}
