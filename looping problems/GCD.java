import java.util.*;
public class GCD {
    static int gcd(int x,int y){
        int m =0;
        for(int i = Math.min(x, y); i>0; i--){
            if(x%i == 0 && y%i == 0){
                m = i;
                return m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(gcd(12, 16));
        
    }
}
