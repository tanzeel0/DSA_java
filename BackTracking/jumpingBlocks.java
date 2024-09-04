public class jumpingBlocks {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int arr[][] = {{1,0,1},{1,1,1},{0,1,1}};
        maze(0,0,r-1,c-1,"",arr);
        
    }
    private static void maze(int sr, int sc, int er, int ec,String s,int [][]check){

        if(sr>er || sc>ec) return;

        if(sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if(check[sr][sc] == 0) return;   

        maze(sr,sc+1,ec,er,s+"R",check);    //right
        maze(sr+1,sc,er,ec,s+"D",check);    //down
    }
}