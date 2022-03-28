package string1;

public class E07_firstHalf {
    public static void main(String[] args) {
/*  Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


        firstHalf("WooHoo") → "Woo"
        firstHalf("HelloThere") → "Hello"
        firstHalf("abcdef") → "abc" */


        System.out.println(   firstHalf("HelloTherea"));
    }

    public static String firstHalf(String word) {

        if(word.length()%2==0){
            return word.substring(0,word.length()/2);
        }
        else return "Word length is not even.";
    }
}
