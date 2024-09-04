public class selectionSort {

    static int[] sort(int a[]){

        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j<n; j++){
                if(a[j] < a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {7, 5, 4, 3, 6, 1};
        int ans[] = sort(a);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
