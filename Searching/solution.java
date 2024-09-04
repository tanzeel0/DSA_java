
class solution {
    static public int[] plusOne(int[] digits) {
        int n = digits.length;
       
        if(digits[n-1] != 9){
            digits[n-1]++;
        }
        
        return digits;
    }
    public static void main(String[] args) {
        int digits[] = {1,2,3};
        int arr[] = plusOne(digits);
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            if(i<arr.length-1) System.out.print(",");
        }
        System.out.print("]");
    }
}