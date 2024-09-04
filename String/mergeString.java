public class mergeString{
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqrs";
        StringBuilder s = new StringBuilder((s1.length()+s2.length()));
        int k=0;
        for(int i=0; i<s1.length(); i++){
            s.insert(k,s1.charAt(i));
            k++;
            s.insert(k,' ');
            k++;
        }
        int i=0,j=0;
        while(i<(s1.length()+s2.length())){
            if(s.charAt(i) == ' '){
                if(j<s2.length()){
                    s.insert(i, s2.charAt(j));
                    j++;i++;
                }
                i++;
            }
        }
        System.out.println(s);
    }
}