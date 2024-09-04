public class ratInMaze {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        maze(1,1,r,c,"");
    }
    static void maze(int sr, int sc, int er, int ec,String s){
        if(sr<1 && sc<1) return;
        if(sr>er || sc>ec) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        maze(sr+1,sc,er,ec,s+"D");   //down
        maze(sr,sc+1,ec,er,s+"R");   //right
        maze(sr-1,sc,er,ec,s+"U");   //up
        maze(sr,sc-1,er,ec,s+"L");   //left
    }
}
