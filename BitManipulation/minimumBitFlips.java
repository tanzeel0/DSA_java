public class minimumBitFlips {
    public static void main(String[] args) {
        int st = 10;
        int end = 20;

        int change = st^end;
        int cnt = 0;

        while(change != 0){
            change = change&change-1;
            cnt++;
        }
        System.out.println(cnt);
    }
}
