package functional1;

import java.util.ArrayList;
import java.util.List;

public class E03_addStar {
    /*
Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]*/
    public static void main(String[] args) {
       List<String> arr= new ArrayList<>();
       arr.add("a");
       arr.add("bb");
       arr.add("ccc");

        System.out.println("addStar(arr) = " + addStar(arr));
    }
    public static List<String> addStar(List<String> strings) {

        strings.replaceAll(s->s+"*");
        return strings;

    }

}
