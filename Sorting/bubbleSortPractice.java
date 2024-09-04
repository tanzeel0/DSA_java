public class bubbleSortPractice{
    static void sorting(String arr[],int n){
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j].compareTo(arr[min]) < 0){
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        String arr[] = {"coding","is","fun"};
        sorting(arr, arr.length);
        for(String val : arr){
            System.out.print(val + ", ");
        }
    }
}