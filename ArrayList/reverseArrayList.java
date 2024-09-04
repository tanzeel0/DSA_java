import java.util.ArrayList;
import java.util.Collections;

public class reverseArrayList {

    static void reverseList(ArrayList<Integer> list){
  
      /*   int i=0, j = list.size() -1;
        while(i<j){

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;j--;
        }*/

        Collections.reverse(list);
        System.out.println("Reversed List" + list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);

        System.out.println("Original List"+ list);
        reverseList(list);

        Collections.sort(list);
        System.out.println("Ascendin oredr" + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order" + list);

        ArrayList<String> str= new ArrayList<>();

        str.add("welcome");
        str.add("to");
        str.add("physics");
        str.add("wallah");


        System.out.println("og" + str);
        Collections.sort(str);
        System.out.println("sorted " + str);
        Collections.sort(str, Collections.reverseOrder());
        System.out.println("Dec sort" + str);
    }  
}
