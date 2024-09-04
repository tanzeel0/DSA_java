import java.util.*;
public class sumofseries {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Original_n=n;
        int sumOfSeries=0;

        for(int i =1;i<=n;i++){
            if(i%2==0){
                sumOfSeries-=i;
            }
            else{
                sumOfSeries+=i;
            }
        }
        System.out.println("the sum of series till " + Original_n + " is: "+ sumOfSeries  );
    }
}
