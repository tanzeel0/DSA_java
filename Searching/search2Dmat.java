public class search2Dmat {

    static boolean search(int arr[][],int t){
        int n = arr.length, m = arr[0].length;
        int st = 0,end = (n*m)-1;
        while(st <= end){
            int mid = st+ (end-st)/2;
            int midel = arr[mid/m][mid%n];
            if(t == midel) return true;
            else if(t > midel) st = mid+1;
            else end = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(arr, 2));
    }
}
