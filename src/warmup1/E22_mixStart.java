package warmup1;

public class E22_mixStart {/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
*/

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }
    public static boolean mixStart(String str) {

        if(str.length()>=3)
            if(str.substring(1,3).equals("ix")) return true;
        return false;
    }

}
