//import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i], 0) +1);
        // }
        // int ans = 0;
        // for (Integer k : mp.keySet()) {
        //     if(mp.get(k) == 1) ans = k;
        // }
        // System.out.println(ans);
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }
        System.out.println(xor);

    }
}
