import java.util.*;
public class sumOf2DArray {

    static void prefSum(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;

        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j] += arr[i][j-1];
            }
        }
    }

    static int sum(int arr[][],int r1,int r2,int c1,int c2){
        int sum = 0;
        prefSum(arr);

        for(int i=r1; i<=r2; i++){
            if(c1 > 0)
                sum += arr[i][c2] - arr[i][c1];
            else
                sum += arr[i][c2];
        }
        return sum;
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
