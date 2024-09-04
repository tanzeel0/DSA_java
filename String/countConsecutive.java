public class countConsecutive {
    public static void main(String[] args) {
        String str = "aaabbbbcccdde";
        int count = 1;
        String ans = "" +str.charAt(0);
        for(int i=1; i<str.length(); i++){
            char cur = str.charAt(i);
            char prev = str.charAt(i-1);
            if(cur == prev) {
                count++;
            }else{
                ans+=count;
                count = 1;
                ans +=cur;
            }
        }
        ans+=count;
        System.out.println(ans);
    }
}
