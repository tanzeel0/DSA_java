import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> l = new ArrayList<>();
        printp(s,"",l);
        System.out.println(l);
    }
    private static void printp(String s,String ans,ArrayList<String> l){
        if(s.equals("")){
            l.add(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            // String l = s.substring(0, i);
            // String r = s.substring(i+1);
            // String rem = l + r;
            String rem = s.substring(0, i) + s.substring(i+1);
            printp(rem, ans+ch, l);
        }
    }
}
