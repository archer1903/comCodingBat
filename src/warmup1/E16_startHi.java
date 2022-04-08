package warmup1;

public class E16_startHi {
    /*
Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/

    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
    }
    public static boolean startHi(String str) {

        if(str.length()>=2)
            return (str.substring(0,2).equals("hi"));
        return false;
    }

}
