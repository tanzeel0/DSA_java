public class revWords {
    public static void main(String[] args) {
        String s = "I am online educator";
        String st = "";
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                str.append(s.charAt(i));
            }else{
                str.reverse();
                st += str;
                st += " ";
                str = new StringBuilder("");
            }
        }
        str.reverse();
        st +=str;
        System.out.print(st);
    }
}
