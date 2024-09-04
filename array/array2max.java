import java.util.Scanner;

public class array2max {
    static int maxnum(int[] arr)
    {
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > mx)
            {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secmax(int[] arr)
    {
        int max = maxnum(arr);
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == max)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondmax = maxnum(arr);
        return secondmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(secmax(arr));
    }
    
}
