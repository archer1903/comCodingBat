package map1;

import java.util.HashMap;
import java.util.Map;

public class E03_mapAB {/*Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
*/

    public static void main(String[] args) {

        Map<String, String> myMap=new HashMap<>();
        myMap.put("a","Hi");

        System.out.println(mapAB(myMap));


    }
    public static Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a")&&map.containsKey("b")){

            String temp=map.get("a")+map.get("b");

            map.put("ab",temp);

        }

        return map;

    }

}
