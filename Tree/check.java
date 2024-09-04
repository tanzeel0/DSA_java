public class check {
    public static void main(String[] args) {
        int arr[] = {9,9,9,9,9,9,9,9,9,9};
        long n = 0;
        for(int i=0; i<arr.length; i++){
            n = n*10 + arr[i];
        }
        n += 1;
        System.out.println(n);
    }
}