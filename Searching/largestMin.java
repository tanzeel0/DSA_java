public class largestMin {

    static boolean check(int a[],int k,int maxDist){
        int kid = 1,lastkid = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] - lastkid >= maxDist) {
                kid++;
                lastkid = a[i];
            }
        }
        return kid>= k;
    }

    static int maxDistance(int a[],int k){
        int ans =0, st = 1, end = (int)1e9;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(check(a, k, mid)){
                ans =mid;
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9};
        System.out.println(maxDistance(arr, 3));
    }
}
