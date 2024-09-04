public class smallestMax{

    static boolean isdivisible(int a[],int m,int max){
        int nS = 1,choc = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] > max) return false;
            if(choc + a[i] <= max){
                choc += a[i];
            }
            else{
                nS++;
                choc = a[i];
            }
        }
        return nS <= m;
    }

    static int distribute(int a[],int m){
        int ans = 0,st = 1,end = (int)1e9;
        while(st<= end){
            int mid = st + (end-st)/2;
            if(isdivisible(a, m, mid)){
                ans = mid;
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {12,34,67,90};
        System.out.println(distribute(arr, 2));
    }
}