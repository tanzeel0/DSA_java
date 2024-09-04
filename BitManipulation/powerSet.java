import java.util.ArrayList;

public class powerSet {
    public static void main(String[] args) {
        int nums[] = {1,2,3};

        //[],[1],[2][1,2],[3],[1,3],[2,3],[1,2,3]

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = 1 << nums.length;
        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                if((i & (1<<j)) != 0) list.add(nums[j]);
            }
            ans.add(list);
        }
        System.out.println(ans);

    }
}
