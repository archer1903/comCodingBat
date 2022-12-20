package string1;

public class E26_frontAgain {
    /*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true*/
    public static void main(String[] args) {
        System.out.println("frontAgain(\"edited\") = " + frontAgain("edited"));
    }
    public static boolean frontAgain(String str) {

        if(str.length()>1){
            String firstTwoChar = str.substring(0,2);
            String lastTwoChar = str.substring(str.length()-2);

            return firstTwoChar.equals(lastTwoChar);
        }

        return false;
    }

}
