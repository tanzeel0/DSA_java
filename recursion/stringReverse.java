public class stringReverse {
    static void reverseString(String s,int idx){
        if(idx < 0) return;
        System.out.println(s.charAt(idx));
        reverseString(s, idx-1);
        
    }
    public static void main(String[] args) {
        String s = "abcde";
        reverseString(s, s.length()-1);
    }
}
