public class palindrome {

    static String reverse(String s,int idx){
        if(idx == s.length()) return "";
        return reverse(s, idx+1) + s.charAt(idx);
    }

    public static void main(String[] args) {
        String s1 = "dad";
        String s2 = "abcde";
        String rev = reverse(s1, 0);
        if(rev.equals(s1)) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
