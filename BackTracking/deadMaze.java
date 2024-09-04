
//optimization
public class deadMaze {
    public static void main(String[] args) {
        int r = 4;
        int c = 4;
        int [][]maze = {{1,0,1,1},{1,1,1,1},{1,1,0,1},{1,1,1,1}};
        //boolean check[][] = new boolean[r][c];
        ways(0,0,r-1,c-1,"",maze);

    }
    private static void ways(int sr,int sc,int er,int ec,String s,int maze[][]){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;

        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        if(maze[sr][sc] == 0) return;
        if(maze[sr][sc] == -1) return;

        maze[sr][sc] = -1;
        ways(sr+1,sc,er,ec,s+"D",maze);
        ways(sr,sc+1,er,ec,s+"R",maze);
        ways(sr-1,sc,er,ec,s+"U",maze);
        ways(sr,sc-1,er,ec,s+"L",maze);
        maze[sr][sc] = 1;
    }
}
