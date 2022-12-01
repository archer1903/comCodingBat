package string2;

public class E4_countCode {
    /*
Return the number of times that the string "code"
appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
   */

    public static void main(String[] args) {
        System.out.println("countCode(\"aaacodebbb\") = " + countCode("abcxyz"));
    }

    public static int countCode(String str) {

        int count = 0;
        int a = 0;

        while (a + 3 < str.length()) {
            a = str.indexOf("co", a);
            if (a == -1) break;
            if (a + 3 < str.length() && str.charAt(a + 3) == 'e') {
                count++;
                a += 4;
                continue;
            }
            a++;
        }
        return count;
    }

}
