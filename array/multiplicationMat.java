import java.util.Scanner;
public class multiplicationMat {

    static void print2DArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void multiply(int arr1[][], int arr2[][],int r1, int c1, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible");
            return;
        }
        int mul[][] = new int [r1][c2];

        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<r2;k++){
                    mul[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Multiplication of 2 Matrix");
        print2DArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and colums of !st Matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int arr1 [][] = new int [r1][c1];

        System.out.println("Enter elements of first Matrix");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter rows and colums of 2nd Matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int arr2 [][] = new int[r2][c2];

        System.out.println("Enter elements of second Matrix");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First Matrix");
        print2DArray(arr1);

        System.out.println("Second Matrix");
        print2DArray(arr2);

        multiply(arr1, arr2, r1, c1, r2, c2);
    }
}
