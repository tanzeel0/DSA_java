public class maxValarray {
    static int maxVal(int arr[],int idx){
        if(idx == arr.length-1) return arr[idx];
        int mx = maxVal(arr, idx+1);
        return Math.max(arr[idx], mx);
    }
    public static void main(String[] args) {
        int arr[] = {3,10,30,2,35};
        System.out.println(maxVal(arr, 0));
    }
}
