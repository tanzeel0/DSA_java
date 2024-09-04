public class kKnights {
    //static int number = 5;
    static int mxk = -1;
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '-';
            }
        }
        validKnights(board,0,0,0);
        System.out.println(mxk);
    }
    static void validKnights(char[][] arr, int r,int c,int num){
        int n = arr.length;
        if(r == n){
            // if(num == number){
            //     for(int i=0; i<n; i++){
            //         for(int j=0; j<n; j++){
            //             System.out.print(arr[i][j]);
            //         }
            //         System.out.println();
            //     }
            //     System.out.println();
            //}
            mxk = Math.max(mxk,num);
            return;
        }

        else if(isSafe(arr, r, c)) {
            arr[r][c] = 'K';
            if(c<n-1) validKnights(arr, r, c+1, num+1);
            else validKnights(arr, r+1, 0, num+1);
            arr[r][c] = '-';
        }
        
        if(c<n-1) validKnights(arr, r, c+1, num);
        else validKnights(arr, r+1, 0, num);        

    }
    static boolean isSafe(char[][] grid,int r,int c){
        int n = grid.length;
        int i,j;
        
        // 2up 1 right
        i = r-2;
        j = c+1;
        if(i>=0 && j<n && grid[i][j] == 'K') return false;

        // 2 up 1 left
        i = r-2;
        j = c-1;
        if(i>=0 && j>=0 && grid[i][j] == 'K') return false;

        // 2 down 1 right
        i = r+2;
        j = c+1;
        if(i<n && j<n && grid[i][j] == 'K') return false;

        // 2 down 1 left
        i = r+2;
        j = c-1;
        if(i<n && j>=0 && grid[i][j] == 'K') return false;

        // 2 right 1 down
        i = r+1;
        j = c+2;
        if(i<n && j<n && grid[i][j] == 'K') return false;

        // 2 right 1 up
        i = r-1;
        j = c+2;
        if(i>=0 && j<n && grid[i][j] == 'K') return false;

        // 2 left 1 down
        i = r+1;
        j = c-2;
        if(i<n && j>=0 && grid[i][j] == 'K') return false;

        // 2 left 1 up
        i = r-1;
        j = c-2;
        if(i>=0 && j>=0 && grid[i][j] == 'K') return false;

        return true;
    }
}
