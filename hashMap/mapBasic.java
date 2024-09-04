import java.util.HashMap;

class mapBasic{
    public static void main(String[] args) {
        HashMap<String, Integer> mp= new HashMap<>();
        mp.put("Akash",21 );
        mp.put("yash",16 );
        mp.put("Lav",17 );
        mp.put("Rishika",19 );
        mp.put("harry",18 );
        System.out.println(mp);

        mp.put("yash",20);
        System.out.println(mp.get("yash"));
        System.out.println(mp.get("Riya"));

        System.out.println(mp.remove("yash"));
        System.out.println(mp.remove("yash"));

        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        for(var k : mp.keySet()){
            System.out.println("Age of Akash : " + mp.get(k));
        }

        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
} 