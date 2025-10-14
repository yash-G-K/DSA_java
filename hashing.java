// abasic hasing operations
import java.util.*;
public class hashing{
    public static void main(String[] args) {
        //create
        HashMap<String,Integer> map = new HashMap<>();

        //insert O(1)
        map.put("india", 30);
        map.put("china", 20);
        map.put("usa", 40);

        System.out.println(map);

        //get O(1)
        System.out.println(map.get("india"));
        System.out.println(map.get("pakistan")); //null value prints

        //contains key O(1)
        System.out.println(map.containsKey("india"));  //true
        System.out.println(map.containsKey("pakistan")); //false
        
        //remove O(1)
        map.remove("china");
        System.out.println(map);

        //size O(1)
        System.out.println(map.size());
    }

}