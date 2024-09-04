public class countSetBits {
    public static void main(String[] args) {
        int n = 12;
        int cnt = 0;

        while(n != 0){
            // if(n%2 == 1) cnt++;
            // n /=2;
            cnt += n&1;
            n >>= 1;
        }
        System.out.println(cnt);

        cnt = 0;
        n = 84;
        while(n != 0){
            n = n&(n-1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
