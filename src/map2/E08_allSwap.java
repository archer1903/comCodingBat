package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E08_allSwap {/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

    public static void main(String[] args) {

        String str[]={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        System.out.println(Arrays.toString(allSwap(str)) );


    }
    public static String[] allSwap(String[] strings) {

        Map<String,Integer > map=new HashMap<>();
        int index=0;
        for(String each:strings){

            if(map.containsKey(each.substring(0,1))){
                String temp=strings[map.get(each.substring(0,1))];
                strings[index]=strings[map.get(each.substring(0,1))];
                strings[map.get(each.substring(0,1))]=temp;

                map.remove(each.substring(0,1));
            }else{
                map.put(each.substring(0,1),0);
            }

            index++;
        }

        return strings;

    }

}
