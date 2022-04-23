package map1;

import java.util.HashMap;
import java.util.Map;

public class E02_mapShare {
    /*
    *
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.


mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
* */
    public static void main(String[] args) {

            Map<String,String> myMap=new HashMap<>();

            myMap.put("a","aaa");
            myMap.put("b","bbb");

        System.out.println(mapShare(myMap));
    }
    public static Map<String, String> mapShare(Map<String, String> map) {

        if(map.containsKey("a")){

            String temp=map.get("a");
            map.put("b",temp);


        }
        map.remove("c");
        return map;
    }

}
