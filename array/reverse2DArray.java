import java.util.*;
public class reverse2DArray{
    static void print2DArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int arr[][],int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[i][j];
        arr[i][j] = temp;
    }   

    static int[][] reverseCol(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                swap(arr, i, j);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array");
        print2DArray(arr);

        System.out.println("Reverse Array"); 
        int ans[][] = reverseCol(arr);
        print2DArray(ans);
    }
}