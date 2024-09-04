public class maze01 {
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int [][]maze = {{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        boolean check[][] = new boolean[r][c];
        ways(0,0,r-1,c-1,"",maze,check);

    }
    private static void ways(int sr,int sc,int er,int ec,String s,int maze[][],boolean [][]check){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;

        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        if(maze[sr][sc] == 0) return;
        if(check[sr][sc]) return;

        check[sr][sc] = true;
        ways(sr+1,sc,er,ec,s+"D",maze,check);
        ways(sr,sc+1,er,ec,s+"R",maze,check);
        ways(sr-1,sc,er,ec,s+"U",maze,check);
        ways(sr,sc-1,er,ec,s+"L",maze,check);
        check[sr][sc] = false;
    }
}
