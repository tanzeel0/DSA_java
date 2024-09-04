import java.util.ArrayList;

public class arrayList {
    static ArrayList<Integer> allIndices(int arr[], int idx,int tr){
        ArrayList<Integer> ans = new ArrayList<>();
        if(idx > arr.length-1) return ans; // Empty arrayList
        if(arr[idx] == tr) ans.add(idx);
        ArrayList<Integer> smallans = allIndices(arr, idx+1, tr);
        ans.addAll(smallans);
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,5};
        ArrayList<Integer> ans = allIndices(arr, 0, 2);

        for(Integer i : ans){
            System.out.println(i);
        }
    }
}
