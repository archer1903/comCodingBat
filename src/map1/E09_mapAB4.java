package map1;

import java.util.HashMap;
import java.util.Map;

public class E09_mapAB4 {/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
*/

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();

        myMap.put("a","aaa");
        myMap.put("b","bb");
        myMap.put("c","cake");

        System.out.println(mapAB4(myMap));
    }
    public static Map<String, String> mapAB4(Map<String, String> map) {

        if(map.containsKey("a")&&map.containsKey("b")){

            if(map.get("a").length()>map.get("b").length()){

                map.put("c",map.get("a"));
                return map;
            }else if(map.get("b").length()>map.get("a").length()){

                map.put("c",map.get("b"));
                return map;
            }else{
                map.put("a","");
                map.put("b","");
                return map;
            }

        }

        return map;

    }

}
