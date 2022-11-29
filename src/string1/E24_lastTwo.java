package string1;

public class E24_lastTwo {

/*Given a string of any length,
return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"*/

    public static void main(String[] args) {

        lastTwo("ab");

    }

    public static String lastTwo(String str) {

        if(str.length()>2){
            String front= str.substring(0,str.length()-2);
            String last2= str.substring(str.length()-2,str.length()-1);
            String last= str.substring(str.length()-1);
            return front+last+last2;
        }

        return str;




    }



}
