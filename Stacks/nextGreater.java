import java.util.Stack;

public class nextGreater {

    static int[] greater(int arr[]){
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=arr.length-2; i>=0; i--){

            while(st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if(st.size() == 0) {
                res[i] = -1;
            }
            else if(st.peek() > arr[i]) {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,8,6,3,4};
        // int res[] = new int[arr.length];

        // for(int i=0; i<arr.length; i++){
        //     res[i] = -1;
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[i] < arr[j]) {
        //             res[i] = arr[j];
        //             break;                   //tc = O(n2)
        //         }
        //     }
        // }
        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i] + " ");
        // }

        int res[] = greater(arr);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}
