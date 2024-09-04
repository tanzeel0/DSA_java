import java.util.*;
class check{

    static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]+1 == nums[i]) cnt++;         
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}