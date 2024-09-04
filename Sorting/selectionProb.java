public class selectionProb {

    static void insertZero(int a[]){
        int n = a.length;
        for(int i=0; i<n-1; i++){
            for(int j= i; j<n-i-1; j++){
                if(a[j] == 0 && a[j+1] !=0 ){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    j--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {0, 8, 0, 6, 5, 0, 2};
        insertZero(a);
        for(int i: a){
            System.out.print(i + " ");
        }
    }
}
