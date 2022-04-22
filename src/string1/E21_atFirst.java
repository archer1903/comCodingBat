package string1;

public class E21_atFirst {
    public static void main(String[] args) {
        /*Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.


atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"*/
        System.out.println(atFirst("hello"));
    }
    public static String atFirst(String str) {
        if(str.length()<1){
            return "@@";
        }else if(str.length()<2){
            return str.substring(0,1)+"@";
        }else{
            return str.substring(0,2);
        }

    }

}
