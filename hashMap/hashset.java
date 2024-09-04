import java.util.HashSet;

public class hashset {

    static int table(int arr[]){
        HashSet<Integer> st = new HashSet<>();
        int mx = 0;
        for(int i: arr){
            if(st.contains(i)) {
                st.remove(i);
            }
            else{
                st.add(i);
                mx = Math.max(mx,st.size());
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        int nums[] = {1,1};
        System.out.println(table(nums));
    }
}
