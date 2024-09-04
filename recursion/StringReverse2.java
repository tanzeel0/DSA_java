public class StringReverse2 {
    static String reverse(String s,int idx){
        if(idx == s.length()) return " ";
        return reverse(s, idx+1) + s.charAt(idx);
    }
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(reverse(s, 0));

    }
}
