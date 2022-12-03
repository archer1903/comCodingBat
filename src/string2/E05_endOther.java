package string2;

public class E05_endOther {
    /*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true*/

    public static void main(String[] args) {
        String a = "Hiabc";
        String b = "abc";

        System.out.println("endOther(a,b) = " + endOther(a, b));
    }

    public static boolean endOther(String a, String b) {


        int strA=a.length();
        int strB=b.length();

        if(strA>=strB&&a.substring(strA-strB).toLowerCase().equals(b.toLowerCase())) return true;
        if(strB>strA&&b.substring(strB-strA).toLowerCase().equals(a.toLowerCase())) return true;
        return false;


    }

}
