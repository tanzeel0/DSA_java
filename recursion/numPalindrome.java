public class numPalindrome {
    static int isPalindrome(int num,int rev){
        if(num == 0) return rev;
        rev = (rev*10) + (num%10);
        return isPalindrome(num/10, rev);
    }
    public static void main(String[] args) {
        int num1 = 1221;
        int num2 = 1234;
        int rev = isPalindrome(num1, 0);
        if(rev == num1) System.out.println("yes");
        else System.out.println("no");
    }
}
