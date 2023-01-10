package string1;

public class E27_minCat {

    public static void main(String[] args) {

        /*
Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"*/

        System.out.println("minCat(\"Hello\",\"Hi\") = " + minCat("Hello", "Hi"));


    }

    public static String minCat(String a, String b) {

        int len1=a.length();
        int len2=b.length();

        if(len1>len2){
            return  a.substring(len1-len2).concat(b);
        }else{
            return a.concat(b.substring(len2-len1));
        }





    }


}
