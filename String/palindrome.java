public class palindrome {
    public static void main(String[] args) {
        String a = "abcdcba";
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        String s = b + "";
        if(a.equals(s)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
