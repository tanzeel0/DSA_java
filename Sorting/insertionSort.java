public class insertionSort {
    static void insert(int a[]){
        int n = a.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j > 0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {8, 3, 6, 5, 4, 2};
        insert(a);
        for(int i: a){
            System.out.print(i + " ");
        }
    }
}
