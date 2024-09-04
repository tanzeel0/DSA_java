public class lexicoGraphicalSorting {
    static void sorting(String s[]){
        int n = s.length;
        for(int i=0; i<n-1; i++){
            int min_index = i;
            for(int j= i+1; j<n; j++){
                if(s[j].compareTo(s[min_index]) < 0){
                    min_index = j;
                }
            }
            String temp = s[i];
            s[i] = s[min_index];
            s[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        String s[] = {"papaya", "lime", "kiwi", "watermelon", "apple", "mango"};
        sorting(s);
        for(String st : s){
            System.out.print(st + " ");
        }
    }
}
