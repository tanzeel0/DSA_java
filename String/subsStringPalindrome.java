public class subsStringPalindrome {
    static boolean isPalindrome(String s){

        int i=0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "abba";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                if(isPalindrome(s.substring(i,j)) == true){
                    count++;
                    System.out.print(s.substring(i,j) + " ");
                }
            }
        }
        System.out.println(count);
    }
}
