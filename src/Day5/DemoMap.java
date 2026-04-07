package Day5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"one");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "four");

        System.out.println(map);

        map.remove(2);
        System.out.println(map.get(3));

        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("one"));

        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(key + ":"+ map.get(key));
        }

        System.out.println("---------------------------------------");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+":" + entry.getValue());
        }

    }
}
