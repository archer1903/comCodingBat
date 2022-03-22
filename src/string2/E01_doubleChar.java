package string2;

public class E01_doubleChar {

    //Given a string, return a string where for every
    // char in the original, there are two chars.
    //doubleChar("The") → "TThhee"
    public static void main(String[] args) {

        System.out.println(doubleChar("The"));
    }
    public static String doubleChar(String str) {

        String str2="";

        for(int i=0; i<str.length(); i++) {
            str2+=str.substring(i,i+1);
            str2+=str.substring(i,i+1);
        }
        return str2;

    }

}
