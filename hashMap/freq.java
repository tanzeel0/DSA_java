import java.util.*;

public class freq {

    static int frequency(int arr[]){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int el : arr){
            if(!mp.containsKey(el)) mp.put(el, 1);
            else mp.put(el,mp.get(el)+1);
        }
        int mx =0;
        int ans = -1;
        
        // for(var e: mp.entrySet()) {
        //     if(e.getValue() > mx) {
        //         mx = e.getValue();
        //         ans = e.getKey();
        //     }
        // }
        
        for(var e: mp.keySet()) {
            if(mp.get(e) > mx) {
                mx = mp.get(e);
                ans = e;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,4,2,2,2,1};
        System.out.println(frequency(arr));
    }
}
