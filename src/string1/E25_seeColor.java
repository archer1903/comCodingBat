package string1;

public class E25_seeColor {


    public static void main(String[] args) {

/*Given a string, if the string begins with "red" or "blue"
return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"*/


        System.out.println(seeColor("redxx"));


    }


    public static String seeColor(String str) {
        if(str.length()>2&&str.substring(0,3).contains("red")){
            return str.substring(0,3);
        }
        if(str.length()>3&&str.substring(0,4).equals("blue")){
            return str.substring(0,4);
        }
        return "";
    }




}
