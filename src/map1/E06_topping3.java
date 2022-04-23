package map1;

import java.util.HashMap;
import java.util.Map;

public class E06_topping3 {/*Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".


topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
*/

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();

        myMap.put("potato","ketchup");


        System.out.println(topping3(myMap));

    }
    public static Map<String, String> topping3(Map<String, String> map) {

        if(map.containsKey("potato")){
            String temp=map.get("potato");
            map.put("fries",temp);
        }
        if(map.containsKey("salad")){
            String temp=map.get("salad");
            map.put("spinach",temp);
        }

        return map;

    }

}
