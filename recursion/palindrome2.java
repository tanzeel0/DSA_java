public class palindrome2 {

    static boolean isPalindrome(String s, int l,int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
        
    }
    public static void main(String[] args) {
        String s = "level";
        int l=0,r=s.length()-1;
        System.out.println(isPalindrome(s, l, r));
    }
}
