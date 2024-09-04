public class divideTWoIntegers {
    public static void main(String[] args) {
        int dvd = -31;
        int dvs = 3;
        
        if(dvd == dvs) System.out.println(1);
        boolean sign = true;

        if((dvd < 0 && dvs > 0) || (dvd > 0 && dvs < 0)) sign = false;

        dvd = Math.abs(dvd);
        dvs = Math.abs(dvs);
        int ans = 0;
        while(dvd >= dvs){
            int cnt = 0;
            while(dvd >= (dvs << cnt+1)){
                cnt++;
            }
            ans += 1 << cnt;
            dvd -= dvs * (1 << cnt);
        }

        if(ans >= 1<< 31 && sign) System.out.println(Integer.MAX_VALUE);
        if(ans > 1 << 31 && sign) System.out.println(Integer.MIN_VALUE);

        if(sign) System.out.println(ans);
        else System.out.println(-ans);
    }
}
