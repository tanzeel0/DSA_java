public class fourDirection {

    static void maze(int sr,int sc,int er,int ec,String s,boolean check[][]){
        if(sr>er || sc>ec) return;
        if(sr<0 || sc<0) return;
        if(check[sr][sc] == true) return;
        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        check[sr][sc] = true;   //check

        maze(sr+1,sc,er,ec,s+"D",check);   //down
        maze(sr,sc+1,ec,er,s+"R",check);   //right
        maze(sr-1,sc,er,ec,s+"U",check);   //up
        maze(sr,sc-1,er,ec,s+"L",check);   //left

        check[sr][sc] = false;  //uncheck
    }
    public static void main(String[] args) {
        int r = 3,c=3;
        boolean[][] check = new boolean[r][c];
        maze(0, 0, r-1, c-1,"", check);
    }
}
