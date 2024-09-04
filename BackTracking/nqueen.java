public class nqueen {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '-';
            }
        }
        queen(board, 0);
    }
    static void queen(char[][] board, int row){
        int n = board.length;
        if(row == n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'q';
                queen(board, row+1);
                board[row][j] = '-'; //backtracking
            }
        }
    }
    static boolean isSafe(char[][] board,int r,int c){
        int n = board.length;
        for(int i=0; i<n; i++){
            if(board[r][i] == 'q') return false;
        }

        for(int i=0; i<n; i++){
            if(board[i][c] == 'q') return false;
        }
        //check ne
        int i=r,j=c;
        while(i>=0 && j<n){
            if(board[i][j] == 'q') return false;
            i--;j++;
        }
        //check se
        i=r;j=c;
        while(i<n && j<n){
            if(board[i][j] == 'q') return false;
            i++;j++;
        }
        //check sw
        i=r;j=c;
        while(i<n && j>=0){
            if(board[i][j] == 'q') return false;
            i++;j--;
        }
        //check nw
        i=r;j=c;
        while(i>=0 && j>=0){
            if(board[i][j] == 'q') return false;
            i--;j--;
        }
        return true;
    }
}
