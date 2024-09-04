class ratMaze{
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        int cnt = maze(1,1,r,c);
        System.out.println(cnt);
    }

    static int maze(int sr, int sc,int er,int ec){
        if(sr>er || sc>ec) return 0;
        if(sr == er || sc == ec) return 1;
        int dw = maze(sr+1,sc,er,ec);
        int rw = maze(sr,sc+1,er,ec);
        return dw+rw;
    }
}