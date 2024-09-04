public class bestcaseSelectionSort {
    static void sort(int a[]){

        int n = a.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j= i+1; j<n; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {7, 5, 4, 3, 6, 1};
        sort(a);
        for(int i: a){
            System.out.println(i);
        }
    }
}
