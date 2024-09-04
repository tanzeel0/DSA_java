public class keyCombination {
    static void printCombination(String s,String res,String []kP){
        if(s.length() == 0) {
            System.out.println(res + " ");
            return;
        }
        int curNum = s.charAt(0) - '0';
        String curChoice = kP[curNum];
        for(int i=0; i<curChoice.length(); i++){
            printCombination(s.substring(1), res+curChoice.charAt(i), kP);
        }
    }
    public static void main(String[] args) {
        String s = "822";
        String[] kP = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printCombination(s, "", kP);
    }
}
