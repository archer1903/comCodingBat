package warmup1;

public class E13_backAround {
 /*   Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"*/
 public static void main(String[] args) {

  System.out.println(backAround("cat"));
 }

 public static String backAround(String str) {


  String back=str.substring(str.length()-1);

  str=back+str+back;
  return str;

 }

}
