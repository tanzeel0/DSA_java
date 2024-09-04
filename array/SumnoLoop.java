import java.util.Scanner;
public class SumnoLoop {

    static void prefSum(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
        for(int i=1; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] += arr[i-1][j];
            }
        }
    }
    static int sum(int arr[][],int r1,int r2,int c1,int c2){
        int sum = 0, ans = 0, up =0, left =0, leftup = 0;
        prefSum(arr);
            sum = arr[r2][c2];
            if(r1 > 0)
                up = arr[r1-1][c2];
            if(c1 > 0)
                left = arr[r2][c1-1];
            if(r1 > 0 && c1 > 1)
                leftup = arr[r1-1][c1-1];

            ans = sum + up + left + leftup;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimensions: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        for(int i=0; i<q; q++){
            System.out.print("Enter row dimesions: ");
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();

            System.out.print("Enter column dimensions: ");
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();


            int ans = sum(arr, r1, r2, c1, c2);
            System.out.println(ans);
        }
    }
}


