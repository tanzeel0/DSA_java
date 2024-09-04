//import java.util.HashMap;

public class singleNumber2 {
    public static void main(String[] args) {
        int nums[] = {5,5,6,5,4,5,4,4,4};
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i], 0) +1);
        // }
        // int ans = 0;
        // for (Integer i : mp.keySet()) {
        //     if(mp.get(i) == 1) ans = i;
        // }
        // System.out.println(ans);
        int ans = 0;
        for(int i=0; i<31; i++){
            int cnt = 0;
            for(int j=0; j<nums.length-1; j++){
                if((nums[j] & (1 << i)) != 0) cnt++;   
            }
            if(cnt %3 == 1) ans = ans | (1 << i);
        }
        System.out.println(nums[ans]);

    }
}
