package map1;

import java.util.HashMap;
import java.util.Map;

public class E07_mapAB2 {/*Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
*/

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("a","aaa");
        myMap.put("b","aaa");
        myMap.put("c","cake");

        System.out.println(mapAB2(myMap));


    }
    public static Map<String, String> mapAB2(Map<String, String> map) {

        if(map.containsKey("a")&&map.containsKey("b")){
            String tempA=map.get("a");
            String tempB=map.get("b");

            if(tempA.equals(tempB)){
                map.remove("a");
                map.remove("b");
            }
        }

        return map;

    }

}
