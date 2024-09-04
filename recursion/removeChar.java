public class removeChar {

    static void removeA(String s,int idx){
        if(idx >= s.length()) return;
        if(s.charAt(idx) != 'a') System.out.print(s.charAt(idx));
        removeA(s, idx+1);
    }

    public static void main(String[] args) {
        String s = "abcax";
        removeA(s, 0);
    }
}