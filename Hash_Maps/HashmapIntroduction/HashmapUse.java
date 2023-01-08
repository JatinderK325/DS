package Hash_Maps.HashmapIntroduction;

import java.util.HashMap;

public class HashmapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insert
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);

        // check presence 
        // map contains value or not
        if(map.containsKey("abc")){
            System.out.println("Has abc");
        }

        // size
        System.out.println(map.size());

        // get value : gives value of the key
        int val = map.get("abc");
        System.out.println(val);

        // remove : gives value of removed key
        int val1 = map.remove("def");
        System.out.println(val1);

        // containsValue : map contains value or not
        if(map.containsValue(1)){
            System.out.println("Has 1 as value");
        }
    }
    
}


