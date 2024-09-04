public class searchFirstOccurance {

    static int search(int a[],int t){
        int st=0,end = a.length-1,fo = -1;
        while(st <= end){
            int mid = st+(end-st)/2;
            if(t == a[mid]) {
                fo = mid;
                st = mid+1;
            }
            else if(t < a[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,5,5,5,5,6,6,6};
        int target = 5;
        System.out.println(search(arr,target));
    }
}
