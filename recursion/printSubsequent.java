public class printSubsequent {

    static void printSSQ(String s,String curAns){
        if(s.length() == 0){
            System.out.println(curAns);
            return;
        }
        char cur = s.charAt(0);
        String rem = s.substring(1);
        printSSQ(rem, curAns+cur);
        printSSQ(rem, curAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}