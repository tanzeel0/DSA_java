public class bubbleOne {

    static void bubleSort(int a[]){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {5,7,4,3,2,4};
        bubleSort(a);
        for(int i: a){
            System.out.println(i + " ");
        }
    }
}
