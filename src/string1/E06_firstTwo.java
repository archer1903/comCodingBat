package string1;

public class E06_firstTwo {
    public static void main(String[] args) {
/*        Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.


        firstTwo("Hello") → "He"
        firstTwo("abcdefg") → "ab"
        firstTwo("ab") → "ab"*/
        System.out.println(firstTwo("He"));
    }
    public static String firstTwo(String str) {
        if(str.length()<2) return str;
        return str.substring(0,2);
    }
}
