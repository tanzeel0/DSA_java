public class printWays {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        maze(1,1,r,c,"");
        
    }
    static void maze(int sr, int sc, int er, int ec,String s){
        
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        maze(sr+1,sc,er,ec,s+"D");
        maze(sr,sc+1,ec,er,s+"R");
    }
}
