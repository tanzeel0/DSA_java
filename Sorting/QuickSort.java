public class QuickSort{

    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int arr[],int s,int l){
        int pvt = arr[s];
        int cnt = 0;
        for(int i=s+1; i<=l; i++){
            if(arr[i] <= pvt) cnt++;
        }
        int pvtIdx = s+cnt;
        swap(arr, s, pvtIdx);

        int i = s,j = l;
        while(i < pvtIdx && j > pvtIdx){
            while(arr[i] <= pvt) i++;
            while(arr[j] > pvt) j--;
            if(i<pvtIdx && j>pvtIdx){
                swap(arr, i, j);
                i++;j--;
            }
        }
        return pvtIdx;
    }

    static void sorting(int arr[], int s,int l){
        if(s>=l) return;
        int pvt = partition(arr, s, l);
        sorting(arr, s, pvt-1);
        sorting(arr, pvt+1, l);
     }
    public static void main(String[] args) {
        int arr[] = {7, 13, 8, 5, 10, 2, 4};
        sorting(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}