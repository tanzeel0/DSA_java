public class bit {
    public static void main(String[] args) {
        int n = 13;
        String s = "";
        while(n != 0){
            if(n%2 == 1) s += "1";
            else s += "0";
            n /=2;
        }

        String rev = "";
        int x = s.length()-1;
        while(x>=0){
            rev += s.charAt(x);
            x--;
        }
        System.out.println(rev);

        int i = 0;
        int pow = 0;
        int num = 0;
        while(i<s.length()){
            int ind = s.charAt(i) - '0';
            num += (int) Math.pow(2*ind,pow);
            pow++;
            i++;
        }
        System.out.println(num);
    }

}