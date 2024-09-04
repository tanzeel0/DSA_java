import java.util.ArrayList;
public class subsequentArrayList {
    static ArrayList<String> subsequences(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() ==0){
            ans.add("");
            return ans;
        }
        char cur = s.charAt(0);
        ArrayList<String> smallans = subsequences(s.substring(1));
        for(String ss: smallans){
            ans.add(ss);
            ans.add(cur + ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> ans = subsequences(s);
        for(String ss : ans){
            System.out.println(ss);
        }
    }
}
