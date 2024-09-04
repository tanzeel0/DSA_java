public class search2Dmat2 {

    static boolean search(int a[][],int t){
        int n = a.length, m = a[0].length;
        int i=0, j = n-1;
        while(i< n && j >= 0){
        if(a[i][j] == t){
            return true;
        }
        if(t < a[i][j]){
            j--;
        }
        if(t> a[i][j]){
            i++;
        }
        
    }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24,},{18,21,23,26,30}};
        System.out.println(search(arr, 18));
    }

}