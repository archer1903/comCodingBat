package functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E04_copies3 {/*Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.


copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
*/

    public static void main(String[] args) {

        List<String> str = new ArrayList<>(Arrays.asList("a","bb","ccc"));

        System.out.println(copies3(str));



    }
    public static List<String> copies3(List<String> strings) {

        strings.replaceAll(s->s+s+s);
        //s.repeat(3) ??
        return strings;

    }

}
