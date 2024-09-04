public class recursiveBinary {
    static boolean recursiveBS(int arr[],int st,int end,int t){
        if(st>end) return false;
        int mid = (st+end)/2;
        if(t == arr[mid]){
            return true;
        }
        else if(t < arr[mid]){
            recursiveBS(arr, st, mid-1, t);
        }
        else{
            recursiveBS(arr, mid+1, end, t);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int st=0,end = arr.length-1;
        int target = 6;
        System.out.println(recursiveBS(arr,st,end,target));
    }
}
